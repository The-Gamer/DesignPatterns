package org.example.client;

import org.example.strategy.DriveStrategy;
import org.example.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
