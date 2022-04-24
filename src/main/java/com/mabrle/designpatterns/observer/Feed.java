package com.mabrle.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 订阅器
 */
public class Feed implements Subject {

    private final List<Observer> observers = new ArrayList<>();


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers(String tweet) {
        observers.forEach(observer -> observer.notify(tweet));
    }
}
