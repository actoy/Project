package com.joker.exercise.simplefactory;

/**
 *  * 实例ConcreteFactory
 *  *
 *  * @version 1.0
 *  
 */
public class ConcreteFactory {

    public ConcreteFactory(String type) {
        VehicleInterface vehicle = null;

        if ("Bicycle".equals(type)) {
            vehicle = new Bicycle();
        } else if ("Scooter".equals(type)) {
            vehicle = new Scooter();
        }
        if (vehicle == null) {
            throw new RuntimeException("生产对象不存在！");
        }
        vehicle.driveTo();
    }

    public static void main(String[] args) {
        new ConcreteFactory("Bicycle");
        new ConcreteFactory("Scooter");
    }
}
