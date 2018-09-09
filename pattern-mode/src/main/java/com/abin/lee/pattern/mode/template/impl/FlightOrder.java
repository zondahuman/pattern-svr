package com.abin.lee.pattern.mode.template.impl;

import com.abin.lee.pattern.mode.template.AbstractTemplate;

/**
 * Created by abin on 2018/9/9.
 */
public class FlightOrder extends AbstractTemplate {


    public void specialMethod() {
        System.out.println("hi, call specialMethod FlightOrder !!");
    }

    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new FlightOrder();
        abstractTemplate.templateMethod();
    }

}
