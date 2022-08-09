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
public class CastleSignUp {
    @TableId(value = "sign_up_id", type = IdType.AUTO)
    private Integer signUpId;

    private Integer userId;

    private Integer castleId;

    private float castlePay;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime lastModify;
}
