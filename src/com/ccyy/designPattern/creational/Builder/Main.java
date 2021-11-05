package com.ccyy.designPattern.creational.Builder;

import com.ccyy.designPattern.creational.Builder.builders.CarBuilder;
import com.ccyy.designPattern.creational.Builder.builders.CarManualBuilder;
import com.ccyy.designPattern.creational.Builder.cars.Car;
import com.ccyy.designPattern.creational.Builder.cars.Manual;
import com.ccyy.designPattern.creational.Builder.director.Director;

/**
 * @author: lianghanmao
 * @create: 2021-10-25
 * @description:
 **/
public class Main {
    public static void main(String[] args) {
//        创建生成器
        Director director = new Director();
//        创建汽车生成器
        CarBuilder builder = new CarBuilder();
//        生成器设置运动型汽车
        director.constructSportsCar(builder);
//        生成运动型汽车
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

//      生成汽车手册
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
