package com.mabrle.designpatterns.strategy.better;


public class QuickSort implements ISortAlg{
    @Override
    public void sort(String filePath) {
        System.out.println("简单排序");
    }
}
