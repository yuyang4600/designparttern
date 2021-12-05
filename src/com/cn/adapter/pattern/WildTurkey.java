package com.cn.adapter.pattern;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("luo luo jiao");
    }

    @Override
    public void fly() {
        System.out.println("i am flying a short distance");
    }
}
