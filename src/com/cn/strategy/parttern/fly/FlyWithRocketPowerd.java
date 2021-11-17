package com.cn.strategy.parttern.fly;

public class FlyWithRocketPowerd implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly with rocket power");
    }
}
