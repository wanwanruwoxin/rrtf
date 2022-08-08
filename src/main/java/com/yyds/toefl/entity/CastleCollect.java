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
@TableName("castle_collect")
public class CastleCollect {
    @TableId(value = "collect_id", type = IdType.AUTO)
    private Integer collectId;

    private Integer castleId;

    private Integer collectUser;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime lastModify;
}
