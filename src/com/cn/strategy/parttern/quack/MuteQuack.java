package com.cn.strategy.parttern.quack;

public class MuteQuack  implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<  silence  >>");
    }
}
