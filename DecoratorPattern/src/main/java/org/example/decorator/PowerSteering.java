package org.example.decorator;

import org.example.base.BasicCar;

public class PowerSteering extends FeaturesDecorator {
    private BasicCar basicCar;

    public PowerSteering(BasicCar basicCar){
        this.basicCar = basicCar;
    }
    @Override
    public int cost() {
        return basicCar.cost()+10000;
    }
}
