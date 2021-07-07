package com.gamer.creational.builder;

public class Name {
  private final String firstName;
  private final String lastName;

  @Override
  public String toString() {
    return "Name{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
  }

  private Name(Builder builder) {

    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public static class Builder {
    private String firstName;
    private String lastName;

    public Builder firstName(final String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder lastName(final String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Name build() {
      return new Name(this);
    }
  }
}
