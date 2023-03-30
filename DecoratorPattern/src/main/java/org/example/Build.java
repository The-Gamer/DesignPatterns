package org.example;

import org.example.base.BasicCar;
import org.example.base.Maruthi800;
import org.example.decorator.AirConditioning;
import org.example.decorator.PowerSteering;

public class Build {
    public static void main(String[] args) {
       // I was a Maruthi 800 car with AC.

        BasicCar maruthi800WithAC = new AirConditioning(new Maruthi800());
        System.out.println("Cost of maruthi 800 with AC is "+maruthi800WithAC.cost());

        // I was a Maruthi 800 Car with AC and Power steering

        BasicCar maruthi800WIthACAndPowerSteeering = new PowerSteering(new AirConditioning(new Maruthi800()));
        System.out.println("Cost of maruthi 800 with AC and power windows " + maruthi800WIthACAndPowerSteeering.cost());

        // Similary we can find out the cost of other car models along with the required feature.
    }
}