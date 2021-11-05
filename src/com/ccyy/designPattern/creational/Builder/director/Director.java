package com.ccyy.designPattern.creational.Builder.director;

import com.ccyy.designPattern.creational.Builder.builders.Builder;
import com.ccyy.designPattern.creational.Builder.cars.CarType;
import com.ccyy.designPattern.creational.Builder.cars.Engine;
import com.ccyy.designPattern.creational.Builder.components.GPSNavigator;
import com.ccyy.designPattern.creational.Builder.components.Transmission;
import com.ccyy.designPattern.creational.Builder.components.TripComputer;

/**
 * @author: lianghanmao
 * @create: 2021-10-25
 * @description: 生成器
 **/
public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
