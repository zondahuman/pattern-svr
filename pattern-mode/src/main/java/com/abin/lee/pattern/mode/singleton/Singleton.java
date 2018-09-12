package com.abin.lee.pattern.mode.singleton;

/**
 * Created by abin on 2018/9/12.
 */
public class Singleton {
    private Singleton() {
    }

    private static class SingletonInner {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInner.instance;
    }


}
