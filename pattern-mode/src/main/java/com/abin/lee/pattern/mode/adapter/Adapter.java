package com.abin.lee.pattern.mode.adapter;

/**
 * Created by abin on 2018/9/9.
 * 适配器类
 */
public class Adapter extends Adaptee implements Target{


    public void runing(String param) {
        this.run(param); //这里调用被适配者的方法
    }


}
