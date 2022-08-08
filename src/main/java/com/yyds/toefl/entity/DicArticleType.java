package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("dic_article_type")
public class DicArticleType {
    @TableId(value = "type_id",type = IdType.AUTO)
    private int typeId;
    private String typeName;
    private String status;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime lastModify;

}
