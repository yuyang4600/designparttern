package com.cn.strategy.parttern.quack;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
