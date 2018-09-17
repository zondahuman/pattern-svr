package com.abin.lee.pattern.mode.decorator.model;

/**
 * Created by abin on 2018/9/17.
 */
public class OrderDecor {
    private int id;
    private String name;
    private String competing;
    private String businessName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompeting() {
        return competing;
    }

    public void setCompeting(String competing) {
        this.competing = competing;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
}
