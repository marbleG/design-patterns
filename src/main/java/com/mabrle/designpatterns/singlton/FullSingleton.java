package com.mabrle.designpatterns.singlton;


/**
 * 饱汉式单例模式
 */
public class FullSingleton {
    private static FullSingleton singleton;
    private static volatile FullSingleton syncSingleton;

    private FullSingleton() {
    }

    /**
     * 不能在多线程状态下使用
     *
     * @return
     */
    public static FullSingleton getSingleton() {
        if (singleton == null) {
            singleton = new FullSingleton();
        }
        return singleton;
    }

    /**
     * 效率低
     *
     * @return
     */
    public static synchronized FullSingleton getSyncSingleton() {
        if (singleton == null) {
            singleton = new FullSingleton();
        }
        return singleton;
    }

    /**
     * 双重检查 线程安全，效率高
     */
    public static FullSingleton getSyncSingletonDoubleCheck() {

        if (syncSingleton == null) {
            synchronized (FullSingleton.class) {
                if (syncSingleton == null) {
                    syncSingleton = new FullSingleton();
                }
            }
        }
        return syncSingleton;
    }

}
