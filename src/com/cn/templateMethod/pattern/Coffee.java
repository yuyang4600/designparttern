package com.cn.templateMethod.pattern;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping cooffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("add suger and milk");
    }
}
