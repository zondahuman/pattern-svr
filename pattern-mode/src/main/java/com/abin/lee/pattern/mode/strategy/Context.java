package com.abin.lee.pattern.mode.strategy;

/**
 * Created by abin on 2018/9/9.
 * 　　环境(Context)角色：持有一个Strategy抽象策略类或策略接口的引用。
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void behavior(){
        this.strategy.create();
    }


}
