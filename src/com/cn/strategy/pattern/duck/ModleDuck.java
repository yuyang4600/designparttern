package com.cn.strategy.pattern.duck;

import com.cn.strategy.pattern.Duck;
import com.cn.strategy.pattern.fly.FlyNoWay;
import com.cn.strategy.pattern.quack.Quack;

public class ModleDuck extends Duck {
    public ModleDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("modle duck display");
    }
}
