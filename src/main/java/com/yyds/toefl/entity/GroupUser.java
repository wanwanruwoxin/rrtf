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
@TableName("group_user")
public class GroupUser {

    @TableId(value = "group_admin_id", type = IdType.AUTO)
    private Integer groupAdminId;

    private Integer adminId;

    private Integer groupId;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    private char type;
}
