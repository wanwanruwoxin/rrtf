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
@TableName("group_admin_apply")
public class GroupAdminApply {

    @TableId(value = "apply_id", type = IdType.AUTO)
    private Integer applyId;

    private Integer userId;

    private Integer groupId;

    private String applyDesc;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime applyTime;

    private char status;

    private Integer checkTeacher;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime checkTime;
}
