package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
/**
 * Created by zyc on 2022/08/08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("class_sign_up")
public class ClassSignUp {
    @TableId(value = "sign_up_id",type = IdType.AUTO)
    private Integer signUpId;
    private Integer userId;
    private Integer classId;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime lastModify;
}
