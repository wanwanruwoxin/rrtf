package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Created by zyc on 2022/08/08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("dic_user_level")
public class DicUserLevel  {
    @TableId(value = "level_id;",type = IdType.AUTO)
    private int levelId;
    private String levelName;
    private int levelPay;
}
