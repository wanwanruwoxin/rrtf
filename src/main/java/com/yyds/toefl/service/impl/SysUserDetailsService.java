package com.yyds.toefl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.yyds.toefl.dao.SysUserDao;
import com.yyds.toefl.entity.SysUser;
import com.yyds.toefl.entity.SysUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Created by ql on 2022/8/8
 */
@Service
public class SysUserDetailsService implements UserDetailsService {
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isBlank(username)) {
            throw new RuntimeException("用户名不能为空！");
        }
        SysUser sysUser = sysUserDao.selectOne(new LambdaQueryWrapper<SysUser>()
                .select(SysUser::getUserId, SysUser::getLoginName, SysUser::getPassword, SysUser::getStatus)
                .eq(SysUser::getLoginName, username));
        if (Objects.isNull(sysUser)) {
            throw new RuntimeException("用户名不存在");
        }
        UserDetails userDetail = SysUserDetail.builder()
                .id(sysUser.getUserId())
                .loginName(sysUser.getLoginName())
                .password(sysUser.getPassword())
                .status(sysUser.getStatus())
                .build();
        return userDetail;
    }


}
