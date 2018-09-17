package com.abin.lee.pattern.mode.decorator.common;

import com.abin.lee.pattern.mode.decorator.model.OrderDecor;

/**
 * Created by abin on 2018/9/17.
 */
public interface OrderService {

    OrderDecor create(int id);

}
