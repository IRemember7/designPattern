package com.ccyy.designPattern.creational.Builder.components;

import com.ccyy.designPattern.creational.Builder.cars.Car;

/**
 * @author: lianghanmao
 * @create: 2021-10-25
 * @description: 产品特征 中央控制电脑
 **/
public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
