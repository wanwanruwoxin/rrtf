package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("class_infor")
public class ClassInfor {
    @TableId(value = "class_id",type = IdType.AUTO)
    private int classId;
    private int classType;
    private int teacherId;
    private int groupId;
    private String classTitle;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime startDate;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime startTime;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime endTime;
    private String fitPerson;
    private String imtUrl;
    private String classDesc;
    private String classMethod;
    private String classGuide;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime lastModify;
    private int signupNum;
    private String status;

}
