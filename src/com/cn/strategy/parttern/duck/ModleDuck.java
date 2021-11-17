package com.cn.strategy.parttern.duck;

import com.cn.strategy.parttern.Duck;
import com.cn.strategy.parttern.fly.FlyNoWay;
import com.cn.strategy.parttern.quack.Quack;

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
