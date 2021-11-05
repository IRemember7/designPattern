package com.ccyy.designPattern.creational.Builder.builders;

import com.ccyy.designPattern.creational.Builder.cars.CarType;
import com.ccyy.designPattern.creational.Builder.cars.Engine;
import com.ccyy.designPattern.creational.Builder.cars.Manual;
import com.ccyy.designPattern.creational.Builder.components.GPSNavigator;
import com.ccyy.designPattern.creational.Builder.components.Transmission;
import com.ccyy.designPattern.creational.Builder.components.TripComputer;

/**
 * @author: lianghanmao
 * @create: 2021-10-25
 * @description: 汽车手册生成器
 **/
public class CarManualBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
