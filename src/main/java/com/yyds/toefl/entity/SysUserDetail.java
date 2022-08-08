package com.yyds.toefl.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ql on 2022/8/8
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SysUserDetail implements UserDetails {
    private Integer id;
    private String loginName;
    private String password;
    private List<String> roleList;
    private char status;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        roleList = new ArrayList<>();
        roleList.add("READ");
        roleList.add("WRITE");
        return this.roleList.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toSet());
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.loginName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
