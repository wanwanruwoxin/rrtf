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
@TableName("dic_mall_type")
public class DicMallType {
    @TableId(value = "type_id;",type = IdType.AUTO)
    private int typeId;
    private String typeName;
    private String status;
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime lastModify;
}
