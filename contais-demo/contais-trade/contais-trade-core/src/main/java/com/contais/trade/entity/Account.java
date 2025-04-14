package com.contais.trade.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tbl_ct_account")
public class Account {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String userId;
    private Integer money;
}