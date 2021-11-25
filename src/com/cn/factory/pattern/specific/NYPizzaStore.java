package com.cn.factory.pattern.specific;

import com.cn.factory.pattern.basePackage.Pizza;
import com.cn.factory.pattern.basePackage.PizzaIngredientFactory;
import com.cn.factory.pattern.basePackage.PizzaStore;
import com.cn.factory.pattern.specific.pizzaStore.CheesePizza;
import com.cn.factory.pattern.specific.pizzaStore.PepperoniPizza;
import com.cn.factory.pattern.specific.pizzaStore.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("new york style cheesepizza");
        } else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("new york style VeggiePizza");
        } else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("new york style PepperoniPizza");
        } else {
            return null;
        }
        return pizza;
    }
}
