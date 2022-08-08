package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("castle_attachment")
public class CastleAttachment {
    @TableId(value = "attachment_id", type = IdType.AUTO)
    private Integer attachmentId;

    private Integer castleId;

    private String attachmentName;

    private String attachmentUrl;

    private float attachmentSize;
}
