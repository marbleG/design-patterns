package com.mabrle.designpatterns.template;

public abstract class Student {

    public void write() {
        System.out.println("开头");
        writeMain();
        System.out.println("结尾");
    }

    protected abstract void writeMain();
}
