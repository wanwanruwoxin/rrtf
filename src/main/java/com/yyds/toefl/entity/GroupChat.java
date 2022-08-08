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
@TableName("group_chat")
public class GroupChat {

    @TableId(value = "chat_id", type = IdType.AUTO)
    private Integer chatId;

    private Integer userId;

    private Integer groupId;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime lastModify;

    private char type;
}
