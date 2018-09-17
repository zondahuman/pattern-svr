package com.abin.lee.pattern.mode.decorator.common;

import com.abin.lee.pattern.mode.decorator.model.OrderDecor;

/**
 * Created by abin on 2018/9/17.
 */
public class OrderServiceImpl implements OrderService {

    public OrderDecor create(int id) {
        OrderDecor orderDecor = new OrderDecor();
        orderDecor.setId(id);
        orderDecor.setName("红酒");
        return orderDecor;
    }

}
