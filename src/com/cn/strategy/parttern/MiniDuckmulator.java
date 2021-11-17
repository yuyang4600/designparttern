package com.cn.strategy.parttern;

import com.cn.strategy.parttern.duck.MallardDuck;
import com.cn.strategy.parttern.duck.ModleDuck;
import com.cn.strategy.parttern.fly.FlyWithRocketPowerd;

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
