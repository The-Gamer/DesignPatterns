package com.gamer.creational;

public class SingletonImpl {


    private void getConnection(Singleton singleton){
        Connection connection = singleton.getConnetion();
        System.out.println(connection.toString());
    }

    private void returnConnection(Singleton singleton){
        singleton.returnConnection();
    }
    public static void main(String[] args) {
        SingletonImpl singletonImpl = new SingletonImpl();
        Singleton singleton = Singleton.getInstance();
        for(int i=0;i<=10;i++){
            singletonImpl.getConnection(singleton);
        }
    }
}
