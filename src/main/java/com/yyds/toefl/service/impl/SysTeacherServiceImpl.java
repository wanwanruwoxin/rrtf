package com.yyds.toefl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyds.toefl.dao.SysTeacherDao;
import com.yyds.toefl.entity.SysTeacher;
import com.yyds.toefl.service.SysTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysTeacherServiceImpl extends ServiceImpl<SysTeacherDao, SysTeacher> implements SysTeacherService {
    @Autowired
    private SysTeacherDao sysTeacherDao;
    @Override
    public SysTeacher getSysTeacher(String user_name) {
        SysTeacher sysTeacher=sysTeacherDao.selectOne(new LambdaQueryWrapper<SysTeacher>()
                .select(SysTeacher::getUserName,SysTeacher::getSex,SysTeacher::getEmail,SysTeacher::getPhoneNum,SysTeacher::getBirthday,SysTeacher::getCreateTime)
                .eq(SysTeacher::getUserName,user_name));
        return sysTeacher;
    }
}
