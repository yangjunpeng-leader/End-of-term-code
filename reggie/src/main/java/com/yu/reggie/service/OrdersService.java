package com.yu.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yu.reggie.entity.Orders;

import java.util.List;

public interface OrdersService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);


}
