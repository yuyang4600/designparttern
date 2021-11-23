package com.cn.decorator.pattern.condiement.specific;

import com.cn.decorator.pattern.basePackage.Beverage;
import com.cn.decorator.pattern.basePackage.CondiementDecorator;

public class Soy extends CondiementDecorator {
    public Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }
}
