package com.cn.templateMethod.pattern;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("boilling water");
    }
    public void pourInCup() {
        System.out.println("pouring into cup");
    }

    abstract void brew() ;

    abstract void addCondiments();
}
