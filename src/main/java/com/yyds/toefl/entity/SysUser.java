package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by ql on 2022/8/8
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@TableName("sys_user")
public class SysUser {
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;
    private String loginName;
    private String password;
    private char sex;
    private String email;
    private String phoneNum;
    private LocalDateTime birthday;
    private String personalizeSignature;
    private String imgUrl;
    private Integer userLevel;
    private Double currencyNum;
    private char status;
    private LocalDateTime registerTime;
    private LocalDateTime lastModify;
}
