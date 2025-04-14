package com.contais.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.contais.order.entity.Storage;
import com.contais.order.mapper.StorageMapper;
import com.contais.order.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    @Override
    public void deduct(String commodityCode, int orderCount) {
        log.info("扣除存储数量 commodityCode:{},orderCount:{}", commodityCode, orderCount);
    }
}
