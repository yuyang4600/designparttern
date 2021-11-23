package com.cn.decorator.pattern;

import com.cn.decorator.pattern.basePackage.Beverage;
import com.cn.decorator.pattern.beverage.specific.DarkRoast;
import com.cn.decorator.pattern.beverage.specific.Espresso;
import com.cn.decorator.pattern.beverage.specific.HouseBlend;
import com.cn.decorator.pattern.condiement.specific.Mocha;
import com.cn.decorator.pattern.condiement.specific.Soy;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + ", $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + ", $" + beverage2.cost());
    }
}
