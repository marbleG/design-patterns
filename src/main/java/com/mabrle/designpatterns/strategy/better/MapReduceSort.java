package com.mabrle.designpatterns.strategy.better;

public class MapReduceSort implements ISortAlg {
    @Override
    public void sort(String filePath) {
        System.out.println("利用MapReduce多机排序");
    }
}
