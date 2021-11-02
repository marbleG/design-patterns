package com.mabrle.designpatterns.singlton;

public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    /**
     * 使用时才创建
     */
    private static class SingletonInstance {
        private static final InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonInstance.singleton;
    }
}
