package com.yyds.toefl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yyds.toefl.entity.SysTeacher;

public interface SysTeacherService extends IService<SysTeacher> {
    SysTeacher getSysTeacher(String user_name);
}
