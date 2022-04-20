package com.ccyy.designPattern.structural.decorator.decorators;

/**
 * @author: lianghanmao
 * @create: 2022-04-20
 * @description: 抽象基础装饰
 **/
public class DataSourceDecorator  implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
