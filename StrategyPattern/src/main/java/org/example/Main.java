package org.example;

import org.example.client.PassengerVehicle;
import org.example.client.SportsVehicle;
import org.example.client.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();

        Vehicle vehicle1 = new PassengerVehicle();
        vehicle1.drive();
    }
}