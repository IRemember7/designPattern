package com.ccyy.designPattern.creational.singleton;

import com.ccyy.designPattern.creational.singleton.multithreaded.DatabaseMultiThreaded;
import com.ccyy.designPattern.creational.singleton.singleThreaded.Database;

/**
 * @author: lianghanmao
 * @create: 2021-10-13
 * @description: 测试
 **/
public class Main {
    public static void main(String[] args) {
//        单线程单例模式测试
        Database database1 = Database.getInstance("单线程1");
        Database database2 = Database.getInstance("单线程2");
        System.out.println(database1.databaseName);
        System.out.println(database2.databaseName);
//        多线程测试
        new Thread(() ->{
            DatabaseMultiThreaded databaseMultiThreaded = DatabaseMultiThreaded.getInstance("多线程1");
            System.out.println(databaseMultiThreaded.databaseName);
        }).start();

        new Thread(() ->{
            DatabaseMultiThreaded databaseMultiThreaded = DatabaseMultiThreaded.getInstance("多线程2");
            System.out.println(databaseMultiThreaded.databaseName);
        }).start();
    }
}
