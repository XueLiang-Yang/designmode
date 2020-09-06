package com.liang.singleton;

/*
* 懒汉式单例
* 特点：在类加载时没有生成单例，只有当第一次调用getInstance方法时才去创建这个单例
* */
public class LazySingleton {

    private static volatile LazySingleton instance = null;//保证instance在所有线程中同步

    private LazySingleton() {} //private避免类在外部被实例化

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
