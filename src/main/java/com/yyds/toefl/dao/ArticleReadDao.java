package com.yyds.toefl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyds.toefl.entity.ArticleCollect;
import com.yyds.toefl.entity.ArticleRead;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleReadDao extends BaseMapper<ArticleRead> {
}
