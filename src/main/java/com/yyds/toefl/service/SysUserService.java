package com.yyds.toefl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yyds.toefl.entity.SysUser;

/**
 * Created by ql on 2022/8/8
 */
public interface SysUserService extends IService<SysUser> {
    void register(SysUser sysUser);
}
