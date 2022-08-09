package com.yyds.toefl.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyds.toefl.entity.ArticleCollect;
import com.yyds.toefl.entity.ArticleComment;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleCommentDao extends BaseMapper<ArticleComment> {
}
