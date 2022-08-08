package com.yyds.toefl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lsx on 2022/08/08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_active")
public class SysActive {

    @TableId(value = "activeId", type = IdType.AUTO)
    private Integer activeId;

    private String activeName;

    private Integer classId;

    private String imgUrl;

    private String activeDesc;
}
