package org.example;

import org.example.observable.WeatherObservable;
import org.example.observable.WeatherObservableImpl;
import org.example.observer.EmailObserverImpl;
import org.example.observer.MobileObserverImpl;
import org.example.observer.WeatherObserver;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating the observable to subscribe observers.
        WeatherObservable weatherObservable = new WeatherObservableImpl();

        //Subscribing users
        WeatherObserver user1 = new EmailObserverImpl("user1@yopmail.doc", weatherObservable);
        WeatherObserver user2 = new EmailObserverImpl("user2@yopmail.com", weatherObservable);
        WeatherObserver mobileUser1 = new MobileObserverImpl("9880012345", weatherObservable);

        //Adding subscribers to weather observers list
        weatherObservable.add(user1);
        weatherObservable.add(user2);
        weatherObservable.add(mobileUser1);


        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Type 0.0f if you want to exit the program");
            System.out.println("Enter new temp");
            float inputTemp = scanner.nextFloat();
            if(inputTemp!= 0.0f)
                weatherObservable.setTemp(inputTemp);
            else
                System.exit(0);
        }

    }
}