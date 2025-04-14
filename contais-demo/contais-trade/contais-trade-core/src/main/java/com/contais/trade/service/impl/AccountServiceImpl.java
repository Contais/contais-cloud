package com.contais.trade.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.contais.trade.entity.Account;
import com.contais.trade.mapper.AccountMapper;
import com.contais.trade.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean debit(String userId, int money) {
        Account account = getOne(Wrappers.<Account>lambdaQuery().eq(Account::getUserId, userId));
        if (account == null) {
            return false;
        }
        if (account.getMoney() < money) {
            log.error("账户余额不足 userId:{},money:{} account.money:{}", userId, money, account.getMoney());
            return false;
        }
        account.setMoney(account.getMoney() - money);
        updateById(account);
        return true;
    }
}
