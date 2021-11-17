package com.cn.strategy.parttern.duck;

import com.cn.strategy.parttern.Duck;
import com.cn.strategy.parttern.fly.FlyWithwings;
import com.cn.strategy.parttern.quack.MuteQuack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithwings();
    }

    @Override
    public void display() {
        System.out.println(" mallardDuck");
    }
}
