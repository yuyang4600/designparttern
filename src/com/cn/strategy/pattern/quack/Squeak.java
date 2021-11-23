package com.cn.strategy.pattern.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("speak quack");
    }
}
