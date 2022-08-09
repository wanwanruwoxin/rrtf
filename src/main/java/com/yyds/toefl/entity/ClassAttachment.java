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
@TableName("castle_sign_up")
public class ClassAttachment {
    @TableId(value = "attachment_id", type = IdType.AUTO)
    private Integer attachmentId;

    private Integer classId;

    private String attachmentName;

    private String attachmentUrl;

    private float attachmentSize;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime lastModify;
}
