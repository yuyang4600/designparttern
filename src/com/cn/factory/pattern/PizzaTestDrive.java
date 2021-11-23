package com.cn.factory.pattern;

import com.cn.factory.pattern.basePackage.Pizza;
import com.cn.factory.pattern.basePackage.PizzaStore;
import com.cn.factory.pattern.specific.CHPizzaStore;
import com.cn.factory.pattern.specific.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chStore = new CHPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("----------" + pizza.getName());
        Pizza pizza1 = chStore.orderPizza("cheese");
        System.out.println("----------" + pizza1.getName());
    }
}
