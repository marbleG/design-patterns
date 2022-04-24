package com.mabrle.designpatterns.strategy.basic;

public class ConcreteStrategyA implements Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("第一个策略A");
    }
}
