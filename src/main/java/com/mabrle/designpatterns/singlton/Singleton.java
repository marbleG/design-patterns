package com.mabrle.designpatterns.singlton;

/**
 * 描述： 枚举式单例的写法，防止反序列化
 */
public enum Singleton {
    INSTANCE;

    public void whatever() {
        System.out.println("执行了单例类的方法，例如返回环境变量信息");
    }

    public static void main(String[] args) {
        //演示如何使用枚举写法的单例类
        Singleton.INSTANCE.whatever();
    }
}
