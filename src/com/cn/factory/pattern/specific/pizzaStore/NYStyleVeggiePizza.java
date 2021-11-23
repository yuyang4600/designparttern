package com.cn.factory.pattern.specific.pizzaStore;

import com.cn.factory.pattern.basePackage.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "ny store veggie pizza";
        dough = "thin crash dough -- veggie";
        sauce = "marinara sauce -- veggie";

        toppings.add("granted regginao cheese -- veggie");
    }
}
