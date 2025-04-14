package com.contais.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tbl_co_storage")
public class Storage {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String commodityCode;
    private Integer count;
}