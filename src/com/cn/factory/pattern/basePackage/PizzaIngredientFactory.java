package com.cn.factory.pattern.basePackage;

import com.cn.factory.pattern.specific.ingredient.Cheese;
import com.cn.factory.pattern.specific.ingredient.Clams;
import com.cn.factory.pattern.specific.ingredient.Dough;
import com.cn.factory.pattern.specific.ingredient.Pepperoni;
import com.cn.factory.pattern.specific.ingredient.Sauce;
import com.cn.factory.pattern.specific.ingredient.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();
}
