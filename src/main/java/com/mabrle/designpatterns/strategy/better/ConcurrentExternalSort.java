package com.mabrle.designpatterns.strategy.better;


public class ConcurrentExternalSort implements ISortAlg {
    @Override
    public void sort(String filePath) {
        System.out.println("外部多线程排序");
    }
}
