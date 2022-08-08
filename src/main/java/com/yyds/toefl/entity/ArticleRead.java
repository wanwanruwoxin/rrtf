package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("article_read")
public class ArticleRead {
    @TableId(value = "read_id", type = IdType.AUTO)
    private Integer readId;

    private Integer articleId;

    private Integer readUser;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime lastModify;
}
