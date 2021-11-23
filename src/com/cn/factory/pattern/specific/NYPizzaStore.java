package com.cn.factory.pattern.specific;

import com.cn.factory.pattern.basePackage.Pizza;
import com.cn.factory.pattern.basePackage.PizzaStore;
import com.cn.factory.pattern.specific.pizzaStore.NYStyleCheesePizza;
import com.cn.factory.pattern.specific.pizzaStore.NYStylePepperoniPizza;
import com.cn.factory.pattern.specific.pizzaStore.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if(item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if(item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
