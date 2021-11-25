package com.cn.factory.pattern.basePackage;

import com.cn.factory.pattern.specific.ingredient.Cheese;
import com.cn.factory.pattern.specific.ingredient.Clams;
import com.cn.factory.pattern.specific.ingredient.Dough;
import com.cn.factory.pattern.specific.ingredient.Pepperoni;
import com.cn.factory.pattern.specific.ingredient.Sauce;
import com.cn.factory.pattern.specific.ingredient.Veggies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;
    public List toppings = new ArrayList();

    public abstract void prepare() ;


    void bake() {
        System.out.println("bake 25 min");
    }
    void cut() {
        System.out.println("cutting the pizza");
    }
    void box() {
        System.out.println("place pizza in official pizza store");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                ", toppings=" + toppings +
                '}';
    }
}
