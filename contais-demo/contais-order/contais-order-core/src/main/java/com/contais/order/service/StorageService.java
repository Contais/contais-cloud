package com.contais.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.contais.order.entity.Storage;

public interface StorageService extends IService<Storage> {

    void deduct(String commodityCode, int orderCount);
}
