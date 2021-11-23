package com.cn.strategy.pattern.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly no wings");
    }
}
