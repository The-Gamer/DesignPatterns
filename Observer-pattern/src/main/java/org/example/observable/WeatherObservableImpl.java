package org.example.observable;

import org.example.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherObservableImpl implements WeatherObservable{
    private List<WeatherObserver> weatherObserverList = new ArrayList<>();
    private float temp = 0.0f;
    @Override
    public void add(WeatherObserver wo) {
        weatherObserverList.add(wo);
    }

    @Override
    public void remove(WeatherObserver wo) {
        weatherObserverList.remove(wo);
    }

    @Override
    public void notifySubscribers() {
        for (WeatherObserver wo:weatherObserverList) {
            wo.update();
        }
    }

    @Override
    public void setTemp(float temp) {
        if(temp != this.temp){
            this.temp = temp;
            notifySubscribers();
        }else
        System.out.println("Temp not changed");
    }

    @Override
    public float getTemp() {
        return temp;
    }
}
