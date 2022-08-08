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
@TableName("group_infor")
public class GroupInfor {

    @TableId(value = "group_id", type = IdType.AUTO)
    private Integer groupId;

    private Integer groupType;

    private String groupName;

    private String imgUrl;

    private String groupDesc;

    private String groupRule;

    private Integer createTeacher;

    private char status;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime lastModify;

}
