package com.ccyy.designPattern.structural.decorator.decorators;

/**
 * @author: lianghanmao
 * @create: 2022-04-20
 * @description:定义了读取和写入操作的通用数据接口
 **/
public interface DataSource {

    /**
     * 写信息
     * @param data
     */
    void writeData(String data);

    /**
     * 读信息
     * @return
     */
    String readData();
}
