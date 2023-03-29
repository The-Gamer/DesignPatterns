package org.example.observer;

import org.example.observable.WeatherObservable;

public class MobileObserverImpl implements WeatherObserver{
    private String phoneNumber;
    private WeatherObservable weatherObservable;

    public MobileObserverImpl(String phoneNumber, WeatherObservable weatherObservable){
        this.phoneNumber = phoneNumber;
        this.weatherObservable = weatherObservable;
    }
    @Override
    public void update() {
        sendSMS();
    }

    private void sendSMS() {
        System.out.println("Sending text message to " +phoneNumber+ " temp has changed to "+weatherObservable.getTemp());
    }
}
