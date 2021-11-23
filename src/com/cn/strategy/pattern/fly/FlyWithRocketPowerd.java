package com.cn.strategy.pattern.fly;

public class FlyWithRocketPowerd implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly with rocket power");
    }
}
