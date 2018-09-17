package com.abin.lee.pattern.mode.decorator.decoration;

import com.abin.lee.pattern.mode.decorator.common.OrderService;
import com.abin.lee.pattern.mode.decorator.common.OrderServiceImpl;
import com.abin.lee.pattern.mode.decorator.model.OrderDecor;

/**
 * Created by abin on 2018/9/17.
 */
public class DecoratorBusinessService extends OrderServiceImpl {
    private OrderService orderService;

    public DecoratorBusinessService() {
    }

    public DecoratorBusinessService(OrderService orderService) {
        this.orderService = orderService;
    }

    public OrderDecor createBusiness(int id) {

//        OrderDecor orderDecor = new OrderDecor();
        OrderDecor orderDecor = this.orderService.create(id);
        orderDecor.setBusinessName("中国红酒集团");
        return orderDecor;
    }


}
