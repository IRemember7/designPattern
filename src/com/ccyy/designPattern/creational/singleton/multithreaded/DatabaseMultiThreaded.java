package com.ccyy.designPattern.creational.singleton.multithreaded;

/**
 * @author: lianghanmao
 * @create: 2021-10-13
 * @description: 数据库类会对`getInstance（获取实例）方法
 * 进行定义以让客户端在程序各处 都能访问相同的数据库连接实例。
 **/
public final class DatabaseMultiThreaded {
    /**
     * 保存单例实例的成员变量必须被声明为静态类型。
     */
    private static DatabaseMultiThreaded databaseMultiThreaded;
    public String databaseName;

    /**
     * 单例的构造函数必须永远是私有类型，以防止使用`new`运算符直接调用构造方法。
     * @param databaseName
     */
    private DatabaseMultiThreaded(String databaseName) {
//        确保在该线程等待解锁时，其他线程没有初始化该实例。
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.databaseName = databaseName;
    }

    /**
     * 用于控制对单例实例的访问权限的静态方法。
     * @param databaseName
     * @return
     */
    public static DatabaseMultiThreaded getInstance(String databaseName){
        DatabaseMultiThreaded result = databaseMultiThreaded;
        if (result != null){
            return result;
        }
//        控制多线程并发情况
        synchronized (DatabaseMultiThreaded.class){
            if (databaseMultiThreaded == null){
                databaseMultiThreaded = new DatabaseMultiThreaded(databaseName);
            }
            return databaseMultiThreaded;
        }
    }

}
