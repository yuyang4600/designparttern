package com.cn.factory.pattern.specific.pizzaStore;

import com.cn.factory.pattern.basePackage.Pizza;

public class CHStyleCheesePizza extends Pizza {
    public CHStyleCheesePizza() {
        name = "ch store cheese pizza";
        dough = "ch -- thin crash dough";
        sauce = "ch -- marinara sauce";

        toppings.add("ch -- granted regginao cheese");
    }
}
