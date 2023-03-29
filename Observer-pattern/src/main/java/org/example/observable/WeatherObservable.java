package org.example.observable;

import org.example.observer.WeatherObserver;

public interface WeatherObservable {
    public void add(WeatherObserver wo);
    public void remove(WeatherObserver wo);
    public void notifySubscribers();
    public void setTemp(float temp);
    public float getTemp();
}
