package org.example.client;

import org.example.strategy.DriveStrategy;
import org.example.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{

   public PassengerVehicle(){super(new NormalDriveStrategy());
    }

}
