package com.cn.decorator.pattern.condiement.specific;

import com.cn.decorator.pattern.basePackage.Beverage;
import com.cn.decorator.pattern.basePackage.CondiementDecorator;

public class Mocha extends CondiementDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.11 ;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }
}
