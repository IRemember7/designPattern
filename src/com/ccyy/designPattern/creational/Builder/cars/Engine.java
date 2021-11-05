package com.ccyy.designPattern.creational.Builder.cars;

/**
 * @author: lianghanmao
 * @create: 2021-10-25
 * @description: 发动机
 **/
public class Engine {
    /**
     * 体积
     */
    private final double volume;
    /**
     * 里程
     */
    private double mileage;
    /**
     * 起动
     */
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
