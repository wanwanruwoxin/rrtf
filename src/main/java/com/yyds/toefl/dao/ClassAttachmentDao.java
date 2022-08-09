package com.yyds.toefl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyds.toefl.entity.CastleSignUp;
import com.yyds.toefl.entity.ClassAttachment;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassAttachmentDao extends BaseMapper<ClassAttachment> {
}
