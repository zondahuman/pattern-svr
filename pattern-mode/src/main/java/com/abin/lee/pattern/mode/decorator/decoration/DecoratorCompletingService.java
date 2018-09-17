package com.abin.lee.pattern.mode.decorator.decoration;

import com.abin.lee.pattern.mode.decorator.model.OrderDecor;

/**
 * Created by abin on 2018/9/17.
 */
public class DecoratorCompletingService extends DecoratorBusinessService {
    private DecoratorBusinessService decoratorBusinessService;

    public DecoratorCompletingService(DecoratorBusinessService decoratorBusinessService) {
        this.decoratorBusinessService = decoratorBusinessService;
    }


    OrderDecor createCompeting(int id) {
        OrderDecor orderDecor = this.decoratorBusinessService.createBusiness(id);
//        OrderDecor orderDecor = new OrderDecor();
        orderDecor.setCompeting("法国波尔多红酒");
        return orderDecor;
    }


}
