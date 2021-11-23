package com.cn.decorator.pattern.beverage.specific;

import com.cn.decorator.pattern.basePackage.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "espresso";
    }
    @Override
    public double cost() {
        return 1.99 ;
    }
}
