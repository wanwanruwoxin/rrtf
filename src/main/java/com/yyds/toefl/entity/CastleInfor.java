package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("castle_infor")
public class CastleInfor {
    @TableId(value = "castle_id", type = IdType.AUTO)
    private Integer castleId;

    private Integer castleType;

    private Integer mallType;

    private Integer teacherId;

    private Integer groupId;

    private String classTitle;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime startDate;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime endDate;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime startTime;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime endTime;

    private String castleCycle;

    private String fitPerson;

    private float castlePay;

    private String castleAddress;

    private String imgUrl;

    private String castleDesc;

    private String castleMethod;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime lastModify;

    private Integer signupNum;

    private Integer collectNum;

    private Integer commentNum;

    private String status;

}
