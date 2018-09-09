package com.abin.lee.pattern.mode.agent;

/**
 * Created by abin on 2018/9/9.
 */
public class Origin implements Task {
    public void run(String param) {
        System.out.println("hi, " + param);
    }
}
