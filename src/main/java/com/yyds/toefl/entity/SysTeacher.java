package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by lsx on 2022/08/08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_teacher")
public class SysTeacher {

    @TableId(value = "teacherId", type = IdType.AUTO)
    private Integer teacherId;

    private String loginName;

    private String password;

    private String userName;

    private char sex;

    private String email;

    private Integer educationId;

    private String phoneNum;

    private LocalDateTime birthday;

    private String introduce;

    private String imgUrl;

    private Integer articleNum;

    private Integer publicClassNum;

    private Integer castleClassNum;

    private Integer phraseNum;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    private char status;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime lastModify;

}
