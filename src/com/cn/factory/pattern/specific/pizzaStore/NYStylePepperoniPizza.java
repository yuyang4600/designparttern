package com.cn.factory.pattern.specific.pizzaStore;

import com.cn.factory.pattern.basePackage.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "ny store pepperoni pizza ";
        dough = "thin crash dough -- Pepperoni";
        sauce = "marinara sauce -- Pepperoni";

        toppings.add("granted regginao cheese -- Pepperoni");
    }
}
