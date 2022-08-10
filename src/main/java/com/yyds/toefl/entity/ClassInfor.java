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
@TableName("class_infor")
public class ClassInfor {
    @TableId(value = "class_id",type = IdType.AUTO)
    private Integer classId;
    private Integer classType;
    private Integer teacherId;
    private Integer groupId;
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
    private Integer signupNum;
    private String status;

}
