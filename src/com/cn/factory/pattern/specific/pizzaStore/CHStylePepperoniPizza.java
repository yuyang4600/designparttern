package com.cn.factory.pattern.specific.pizzaStore;

import com.cn.factory.pattern.basePackage.Pizza;

public class CHStylePepperoniPizza extends Pizza {
    public CHStylePepperoniPizza() {
        name = "ch store pepperoni pizza";
        dough = "ch -- thin crash dough -- pepperoni";
        sauce = "ch -- marinara sauce -- pepperoni";

        toppings.add("ch -- granted regginao cheese -- pepperoni");
    }
}
