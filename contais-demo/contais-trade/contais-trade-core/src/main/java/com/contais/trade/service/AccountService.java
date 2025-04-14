package com.contais.trade.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.contais.trade.entity.Account;

public interface AccountService extends IService<Account> {

    boolean debit(String userId, int money);
}
