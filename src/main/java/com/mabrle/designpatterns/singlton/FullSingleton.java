package com.mabrle.designpatterns.singlton;


/**
 * 懒汉式单例模式
 */
public class LazySingleton {
    private static LazySingleton singleton;
    private static volatile LazySingleton syncSingleton;

    private LazySingleton() {
    }

    /**
     * 不能在多线程状态下使用
     *
     * @return
     */
    public static LazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    /**
     * 效率低
     *
     * @return
     */
    public static synchronized LazySingleton getSyncSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    /**
     * 双重检查 线程安全，效率高
     */
    public static LazySingleton getSyncSingletonDoubleCheck() {

        if (syncSingleton == null) {
            synchronized (LazySingleton.class) {
                if (syncSingleton == null) {
                    syncSingleton = new LazySingleton();
                }
            }
        }
        return syncSingleton;
    }

}
