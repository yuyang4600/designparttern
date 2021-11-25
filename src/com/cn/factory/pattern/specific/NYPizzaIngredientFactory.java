package com.cn.factory.pattern.specific;

import com.cn.factory.pattern.basePackage.PizzaIngredientFactory;
import com.cn.factory.pattern.specific.ingredient.Cheese;
import com.cn.factory.pattern.specific.ingredient.Clams;
import com.cn.factory.pattern.specific.ingredient.Dough;
import com.cn.factory.pattern.specific.ingredient.FreshClams;
import com.cn.factory.pattern.specific.ingredient.Garlic;
import com.cn.factory.pattern.specific.ingredient.MarinaraSauce;
import com.cn.factory.pattern.specific.ingredient.Mushroom;
import com.cn.factory.pattern.specific.ingredient.Onion;
import com.cn.factory.pattern.specific.ingredient.Pepperoni;
import com.cn.factory.pattern.specific.ingredient.RedPepper;
import com.cn.factory.pattern.specific.ingredient.ReggianoCheese;
import com.cn.factory.pattern.specific.ingredient.Sauce;
import com.cn.factory.pattern.specific.ingredient.SlicedPepperoni;
import com.cn.factory.pattern.specific.ingredient.ThinCrustdough;
import com.cn.factory.pattern.specific.ingredient.Veggies;
import sun.jvm.hotspot.memory.OneContigSpaceCardGeneration;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustdough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
