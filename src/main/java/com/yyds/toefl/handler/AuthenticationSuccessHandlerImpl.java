package com.yyds.toefl.handler;

import com.alibaba.fastjson.JSON;
import com.yyds.toefl.entity.SysUser;
import com.yyds.toefl.vo.Result;
import io.lettuce.core.dynamic.annotation.CommandNaming;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.yyds.toefl.constant.CommonConst.APPLICATION_JSON;

/**
 * Created by ql on 2022/8/9
 */
@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUser sysUser = new SysUser();
        BeanUtils.copyProperties(user, sysUser);
        httpServletResponse.setContentType(APPLICATION_JSON);
        httpServletResponse.getWriter().write(JSON.toJSONString(Result.ok(sysUser)));
    }
}
