package com.cn.factory.pattern.specific.pizzaStore;

import com.cn.factory.pattern.basePackage.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "ny store cheese pizza";
        dough = "thin crash dough";
        sauce = "marinara sauce";

        toppings.add("granted regginao cheese");
    }
}
