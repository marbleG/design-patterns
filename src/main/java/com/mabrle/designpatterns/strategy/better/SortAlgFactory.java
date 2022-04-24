package com.mabrle.designpatterns.strategy.better;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class SortAlgFactory {
    public static final Map<String, ISortAlg> algs = new HashMap<>();

    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (!StringUtils.hasText(type)) {
            throw new IllegalArgumentException("type should not be empty");
        }
        return algs.get(type);

    }
}
