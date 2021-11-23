package com.cn.factory.pattern.basePackage;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public List toppings = new ArrayList();

    void prepare() {
        System.out.println(" prepare " + name );
        System.out.println("tossing tough...");
        System.out.println("adding sauce...");
        System.out.println("adding toppings...");

        for (int i = 0; i < toppings.size(); i ++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("bake 25 min");
    }
    void cut() {
        System.out.println("cutting the pizza");
    }
    void box() {
        System.out.println("place pizza in official pizza store");
    }

    public String getName() {
        return name;
    }
}
