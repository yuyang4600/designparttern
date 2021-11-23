package com.cn.strategy.pattern;

import com.cn.strategy.pattern.duck.MallardDuck;
import com.cn.strategy.pattern.duck.ModleDuck;
import com.cn.strategy.pattern.fly.FlyWithRocketPowerd;

public class MiniDuckmulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modle = new ModleDuck();
        modle.performFly();

        modle.setFlyBehavior(new FlyWithRocketPowerd());
        modle.performFly();
    }
}
