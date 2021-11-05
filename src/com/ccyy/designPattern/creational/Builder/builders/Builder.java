package com.ccyy.designPattern.creational.Builder.builders;

import com.ccyy.designPattern.creational.Builder.cars.CarType;
import com.ccyy.designPattern.creational.Builder.cars.Engine;
import com.ccyy.designPattern.creational.Builder.components.GPSNavigator;
import com.ccyy.designPattern.creational.Builder.components.Transmission;
import com.ccyy.designPattern.creational.Builder.components.TripComputer;

/**
 * @author: lianghanmao
 * @create: 2021-10-25
 * @description: 通用生成器接口
 **/
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
