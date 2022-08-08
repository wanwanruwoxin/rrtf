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
@TableName("sys_teacher_comment")
public class SysTeacherComment {

    @TableId(value = "comentId", type = IdType.AUTO)
    private Integer comentId;

    private Integer teacherId;

    private String comentDesc;

    private Integer commentUser;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime lastModify;
}
