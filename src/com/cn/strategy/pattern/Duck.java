package com.cn.strategy.pattern;

import com.cn.strategy.pattern.fly.FlyBehavior;
import com.cn.strategy.pattern.quack.QuackBehavior;

public abstract class Duck {

    public FlyBehavior flyBehavior;

    public QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("all duck can swim");
    }

    public abstract void display() ;

    public void performFly() {
        flyBehavior.fly();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
