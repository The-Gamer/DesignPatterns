package org.example.observer;

import org.example.observable.WeatherObservable;

public class EmailObserverImpl implements WeatherObserver{
    private String emailId;
    private WeatherObservable weatherObservable;

    public EmailObserverImpl(String emailId, WeatherObservable weatherObservable){
        this.emailId = emailId;
        this.weatherObservable = weatherObservable;
    }
    @Override
    public void update() {
        sendMail();
    }

    private void sendMail() {
        System.out.println("Sending email to " +emailId+ " weather changed to "+weatherObservable.getTemp());
    }
}
