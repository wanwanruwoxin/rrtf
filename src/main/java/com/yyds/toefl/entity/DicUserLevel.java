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
@TableName("dic_user_level")
public class DicUserLevel  {
    @TableId(value = "level_id;",type = IdType.AUTO)
    private int levelId;
    private String levelName;
    private int levelPay;
}
