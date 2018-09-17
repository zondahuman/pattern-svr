package com.abin.lee.pattern.mode.decorator;

import com.abin.lee.pattern.common.JsonUtil;
import com.abin.lee.pattern.mode.decorator.common.OrderService;
import com.abin.lee.pattern.mode.decorator.common.OrderServiceImpl;
import com.abin.lee.pattern.mode.decorator.decoration.DecoratorBusinessService;
import com.abin.lee.pattern.mode.decorator.decoration.DecoratorCompletingService;
import com.abin.lee.pattern.mode.decorator.model.OrderDecor;

/**
 * Created by abin on 2018/9/17.
 */
public class DecoratorClient {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();
        DecoratorBusinessService decoratorBusinessService = new DecoratorBusinessService(orderService);

        DecoratorCompletingService decoratorCompletingService = new DecoratorCompletingService(decoratorBusinessService);
        OrderDecor orderDecor = decoratorCompletingService.createBusiness(1111);
        System.out.println("orderDecor=" + JsonUtil.toJson(orderDecor));
    }
}
