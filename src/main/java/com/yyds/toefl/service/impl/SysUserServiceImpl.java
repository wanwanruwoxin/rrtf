package com.yyds.toefl.service.impl;

import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyds.toefl.dao.SysUserDao;
import com.yyds.toefl.entity.SysUser;
import com.yyds.toefl.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by ql on 2022/8/8
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public void register(SysUser sysUser) {
        sysUser.setBirthday(LocalDateTime.now());
        sysUser.setRegisterTime(LocalDateTime.now());
        sysUser.setLastModify(LocalDateTime.now());
        sysUser.setPassword(BCrypt.hashpw(sysUser.getPassword(), BCrypt.gensalt()));
        sysUserDao.insert(sysUser);
    }


    /**
     * Created by zyc on 2022/8/9
     */
    @Override
    public SysUser getSysUser(String loginName, String passWord) {
        SysUser sysUser = sysUserDao.selectOne(new LambdaQueryWrapper<SysUser>()
                .select(SysUser::getLoginName, SysUser::getPassword, SysUser::getUserId)
                .eq(SysUser::getLoginName, loginName));
        return sysUser;

    }

    @Override
    public void updatePassword(SysUser sysUser) {
        SysUser user = sysUserDao.selectOne(new LambdaQueryWrapper<SysUser>()
                .select(SysUser::getUserId, SysUser::getLoginName)
                .eq(SysUser::getLoginName, sysUser.getLoginName()));
        user.setPassword(BCrypt.hashpw(sysUser.getPassword(), BCrypt.gensalt()));
        user.setEmail(sysUser.getEmail());
        sysUserDao.updateById(user);
    }


}
