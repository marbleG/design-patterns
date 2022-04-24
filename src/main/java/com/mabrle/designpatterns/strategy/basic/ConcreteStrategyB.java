package com.mabrle.designpatterns.strategy.basic;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("第二个策略B");
    }
}
