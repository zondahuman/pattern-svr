package com.abin.lee.pattern.mode.strategy.impl;

import com.abin.lee.pattern.mode.strategy.Strategy;

/**
 * Created by abin on 2018/9/9.
 * 　具体策略(Concrete Strategy)角色：封装了相关的算法或行为。
 */
public class OriginStrategy implements Strategy {


    public void create() {
        System.out.println("hi,  OriginStrategy ");
    }
}
