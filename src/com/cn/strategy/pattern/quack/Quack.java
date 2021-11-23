package com.cn.strategy.pattern.quack;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
