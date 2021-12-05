package com.cn.templateMethod.pattern;

public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("steep tea beg ");
    }

    @Override
    void addCondiments() {
        System.out.println("add Lemon");
    }

}
