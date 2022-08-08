package com.yyds.toefl.controller;

import com.yyds.toefl.entity.SysUser;
import com.yyds.toefl.service.SysUserService;
import com.yyds.toefl.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by ql on 2022/8/8
 */
@Api(tags = "用户账号模块")
@RestController("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public Result register(@RequestBody SysUser sysUser) {
        sysUserService.register(sysUser);
        return Result.ok();
    }
}
