package com.cn.strategy.pattern.fly;

public class FlyWithwings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly");
    }
}
