package com.abin.lee.pattern.mode.decorator.decoration;

import com.abin.lee.pattern.mode.decorator.model.OrderDecor;

/**
 * Created by abin on 2018/9/17.
 */
public abstract class DecoratorService {

    abstract OrderDecor create(int id);


}
