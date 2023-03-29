package org.example.client;

import org.example.strategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy strategy){
        this.driveStrategy = strategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
