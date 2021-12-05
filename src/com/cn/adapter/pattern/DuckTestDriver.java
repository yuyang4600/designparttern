package com.cn.adapter.pattern;

public class DuckTestDriver {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        wildTurkey.gobble();
        wildTurkey.fly();

        testDuck(duck);
        testDuck(turkeyAdapter);

    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
