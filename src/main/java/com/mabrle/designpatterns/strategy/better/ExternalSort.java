package com.mabrle.designpatterns.strategy.better;


public class ExternalSort implements ISortAlg{
    @Override
    public void sort(String filePath) {
        System.out.println("外部排序");
    }
}
