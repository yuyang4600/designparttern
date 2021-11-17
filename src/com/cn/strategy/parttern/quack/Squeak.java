package com.cn.strategy.parttern.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("speak quack");
    }
}
