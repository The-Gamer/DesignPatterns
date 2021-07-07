package com.gamer.creational.singleton;

public class SingletonImpl extends Thread {
  private Singleton singleton;

  SingletonImpl(String name) {
    super(name);
    singleton = Singleton.getInstance();
  }

  @Override
  public void run() {
    try {
      for (int i = 0; i <= 5; i++) {
        System.out.println("Executing for :" + Thread.currentThread().getName());
        getConnection();
      }
    } catch (RuntimeException e) {
      System.out.println("Runtime Exception called for :" + Thread.currentThread().getName());
    }

    returnConnection();
  }

  private void getConnection() {
    Connection connection = singleton.getConnetion();
  }

  private void returnConnection() {
    singleton.returnConnection();
  }

  public static void main(String[] args) {
    Thread t1 = new SingletonImpl("Thread 1");
    Thread t2 = new SingletonImpl("Thread 2");
    t1.start();
    t2.start();
  }
}
