package com.cn.adapter.pattern;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("gua gua jiao");
    }

    @Override
    public void fly() {
        System.out.println("i am flying");
    }
}
