package com.cn.factory.pattern.specific.pizzaStore;

import com.cn.factory.pattern.basePackage.Pizza;

public class CHStyleVeggiePizza extends Pizza {
    public CHStyleVeggiePizza() {
        name = "ch store veggie pizza";
        dough = "ch -- thin crash dough -- veggie";
        sauce = "ch -- marinara sauce -- veggie";

        toppings.add("ch -- granted regginao cheese -- veggie");
    }
}
