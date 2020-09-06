package com.liang.singleton;

/*
* 饿汉式单例
* 特点：类一旦加载就会创建一个单例，保证在调用getInstance方法之前单例已经存在*/
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    private static HungrySingleton getInstance() {
        return instance;
    }
}
