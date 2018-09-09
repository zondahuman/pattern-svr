package com.abin.lee.pattern.mode.adapter;

/**
 * Created by abin on 2018/9/9.
 * 被适配的类， 已经存在的，但是不符合要求，但是需要被调用
 */
public class Adaptee {

    public void run(String param) {
        System.out.println("hi, adaptered " + param);
    }

    
}
