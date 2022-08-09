package com.yyds.toefl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyds.toefl.entity.ArticleComment;
import com.yyds.toefl.entity.ArticleInfor;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleInforDao extends BaseMapper<ArticleInfor> {
}
