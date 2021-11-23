package com.cn.decorator.pattern.beverage.specific;

import com.cn.decorator.pattern.basePackage.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "darkroast";
    }
    @Override
    public double cost() {
        return 2.01 ;
    }
}
