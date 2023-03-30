package org.example.decorator;

import org.example.base.BasicCar;

public class AirConditioning extends FeaturesDecorator{

    private BasicCar basicCar;

    public AirConditioning(BasicCar basicCar){
        this.basicCar = basicCar;
    }
    @Override
    public int cost() {
        return basicCar.cost()+32000;
    }
}
