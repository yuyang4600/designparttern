package com.cn.decorator.pattern.basePackage;

public abstract  class Beverage {
    public String description = "unknow beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost() ;
}
