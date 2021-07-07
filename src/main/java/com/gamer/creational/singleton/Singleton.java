package com.gamer.creational.singleton;

/** Singleton class for creating connection pool of fixed size; */
public class Singleton {
  public static Singleton object = null;
  private Connection[] connections;
  private static final int SIZE = 10;
  private static int CONNECTION_COUNTER = 0;

  private Singleton() {
    initializeConnectionPool();
  }

  // Initializing connection pool objects;
  private void initializeConnectionPool() {
    connections = new Connection[SIZE];
    for (int i = 0; i < connections.length; i++) {
      connections[i] = new Connection();
    }
  }

  // Get connection if a connection instance is available.
  public Connection getConnetion() {
    if (CONNECTION_COUNTER >= 0 && CONNECTION_COUNTER < 10) {
      Connection connection = connections[CONNECTION_COUNTER];
      CONNECTION_COUNTER++;
      return connection;
    } else {
      throw new RuntimeException("ConnectionPool is full");
    }
  }

  // return a connection.
  public void returnConnection() {
    CONNECTION_COUNTER--;
  }

  public static Singleton getInstance() {
    if (object == null) {
      synchronized (Singleton.class) {
        if (object == null) {
          object = new Singleton();
        }
      }
    }
    return object;
  }
}
