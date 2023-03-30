package org.example.decorator;

import org.example.base.BasicCar;

public class AlloyWheels extends FeaturesDecorator {
    private BasicCar basicCar;

    public AlloyWheels(BasicCar basicCar){
        this.basicCar = basicCar;
    }
    @Override
    public int cost() {
        return basicCar.cost()+ 25000;
    }
}
