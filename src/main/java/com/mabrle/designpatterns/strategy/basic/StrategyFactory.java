package com.mabrle.designpatterns.strategy.basic;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    public Strategy getStrategy(String type) {
        if (!StringUtils.hasText(type)) {
            throw new IllegalArgumentException("type should not be empty");
        }
        return strategies.get(type);
    }
}
