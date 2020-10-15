package com.joker.exercise.simplefactory;

/**
 *  * 实例Bicycle
 *  *
 *  * @version 1.0
 *  
 */
public class Bicycle implements VehicleInterface {
    @Override
    public void driveTo() {
        System.out.println("this is a Bicycle!");
    }
}
