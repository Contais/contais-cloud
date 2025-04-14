package com.contais.trade.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.contais.trade.entity.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
}