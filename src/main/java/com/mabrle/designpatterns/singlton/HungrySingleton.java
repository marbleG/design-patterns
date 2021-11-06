package com.mabrle.designpatterns.singlton;


/**
 * 饿汉式单例模式
 * 优点：简单
 * 缺点：初始化就加载，占空间
 * @author marble
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getSingleton() {
        return singleton;
    }
}
