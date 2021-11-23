package com.cn.factory.pattern.specific;

import com.cn.factory.pattern.basePackage.Pizza;
import com.cn.factory.pattern.basePackage.PizzaStore;
import com.cn.factory.pattern.specific.pizzaStore.CHStyleCheesePizza;
import com.cn.factory.pattern.specific.pizzaStore.CHStylePepperoniPizza;
import com.cn.factory.pattern.specific.pizzaStore.CHStyleVeggiePizza;

public class CHPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CHStyleCheesePizza();
        } else if(item.equals("veggie")) {
            return new CHStyleVeggiePizza();
        } else if(item.equals("pepperoni")) {
            return new CHStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
