package com.joker.javase.exercise.simplefactory;

/**
 *  * 实例Scooter
 *  *
 *  * @version 1.0
 *  
 */
public class Scooter implements VehicleInterface {
    @Override
    public void driveTo() {
        System.out.println("this is a Scooter!");
    }
}
