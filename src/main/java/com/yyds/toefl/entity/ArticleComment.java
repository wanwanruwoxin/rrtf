package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("article_comment")
public class ArticleComment {
    @TableId(value = "coment_id", type = IdType.AUTO)
    private Integer comentId;

    private Integer articleId;

    private String comentDesc;

    private Integer commentUser;

    private Integer commentTeacher;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime lastModify;
}
