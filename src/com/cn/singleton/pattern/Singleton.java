package com.cn.singleton.pattern;

public class Singleton {
    private volatile static Singleton singleton;

    private Singleton(){}

    public Singleton getInstance() {
        if (singleton == null) {
            synchronized(Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }
}
