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
@TableName("article_infor")
public class ArticleInfor {
    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;

    private String title;

    private Integer publishTeacher;

    private Integer articleType;

    private String imgUrl;

    private String articleDetail;

    private Integer collectNum;

    private Integer readNum;

    private String status;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime lastModify;
}
