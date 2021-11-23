package com.cn.strategy.pattern.quack;

public class MuteQuack  implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<  silence  >>");
    }
}
