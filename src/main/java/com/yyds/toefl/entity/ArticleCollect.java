package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("article_collect")
public class ArticleCollect {
    @TableId(value = "phrase_id", type = IdType.AUTO)
    private Integer phraseId;

    private Integer articleId;

    private Integer collectUser;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime lastModify;
}
