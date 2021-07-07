package com.gamer.creational.builder;

public class Account {
  private final int accountId;
  private final String email;
  private final Name name;
  private final Address address;

  private Account(Builder builder) {
    this.accountId = builder.accountId;
    this.email = builder.email;
    this.address = builder.address;
    this.name = builder.name;
  }

  public int getAccountId() {
    return accountId;
  }

  public String getEmail() {
    return email;
  }

  public Name getName() {
    return name;
  }

  public Address getAddress() {
    return address;
  }

  public static class Builder {
    private int accountId;
    private String email;
    private Name name;
    private Address address;

    public Builder id(final int id) {
      this.accountId = id;
      return this;
    }

    public Builder email(final String email) {
      this.email = email;
      return this;
    }

    public Builder address(final Address address) {
      this.address = address;
      return this;
    }

    public Builder name(final Name name) {
      this.name = name;
      return this;
    }

    public Account build() {
      return new Account(this);
    }
  }
}
