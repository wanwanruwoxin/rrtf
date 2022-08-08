package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by lsx on 2022/08/08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_sign_in")
public class SysSignIn {

    @TableId(value = "sign_in_id", type = IdType.AUTO)
    private Integer signInId;

    private Integer userId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime signTime;
}
