package com.cn.observer.parttern.rootInterface;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
