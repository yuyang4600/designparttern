package com.cn.strategy.pattern.duck;

import com.cn.strategy.pattern.Duck;
import com.cn.strategy.pattern.fly.FlyWithwings;
import com.cn.strategy.pattern.quack.MuteQuack;

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
