package com.abin.lee.pattern.mode.strategy;

import com.abin.lee.pattern.mode.strategy.impl.AdvancedStrategy;

/**
 * Created by abin on 2018/9/9.
 * 策略模式
 * https://www.cnblogs.com/WJQ2017/p/7629109.html
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = new AdvancedStrategy();
        Context context = new Context(strategy);
        context.behavior();
    }
}
