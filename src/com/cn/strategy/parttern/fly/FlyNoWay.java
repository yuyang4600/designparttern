package com.cn.strategy.parttern.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly no wings");
    }
}
