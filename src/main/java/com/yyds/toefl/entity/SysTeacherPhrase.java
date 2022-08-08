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
@TableName("sys_teacher_phrase")
public class SysTeacherPhrase {

    @TableId(value = "phrase_id", type = IdType.AUTO)
    private Integer phraseId;

    private Integer teacherId;

    private Integer userId;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime lastModify;


}
