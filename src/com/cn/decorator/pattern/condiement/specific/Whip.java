package com.cn.decorator.pattern.condiement.specific;

import com.cn.decorator.pattern.basePackage.Beverage;
import com.cn.decorator.pattern.basePackage.CondiementDecorator;

public class Whip extends CondiementDecorator {
    public Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.22 ;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }
}
