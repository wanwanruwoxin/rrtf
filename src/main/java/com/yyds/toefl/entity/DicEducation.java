package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("dic_education")
public class DicEducation {
    @TableId(value = "education_id",type = IdType.AUTO)
    private int educationId;
    private String educationName;
    private String educationDesc;
}
