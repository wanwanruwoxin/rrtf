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
@TableName("sys_link")
public class SysLink {

    @TableId(value = "link_id", type = IdType.AUTO)
    private Integer linkId;

    private String linkName;

    private String linkUrl;

    private String relateUnit;

    private String linkDesc;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime lastMofify;
}
