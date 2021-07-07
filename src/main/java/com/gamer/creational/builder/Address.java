package com.gamer.creational.builder;

public class Address {
  private final int houseNo;
  private final String streetName;
  private final String city;
  private final String state;
  private final String country;
  private final int pincode;
  private final String landMark;

  private Address(Builder builder) {
    this.houseNo = builder.houseNo;
    this.streetName = builder.streetName;
    this.city = builder.city;
    this.state = builder.state;
    this.country = builder.country;
    this.pincode = builder.pincode;
    this.landMark = builder.landMark;
  }

  public int getHouseNo() {
    return houseNo;
  }

  public String getStreetName() {
    return streetName;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  public String getCountry() {
    return country;
  }

  public int getPincode() {
    return pincode;
  }

  public String getLandMark() {
    return landMark;
  }

  public static class Builder {
    private int houseNo;
    private String streetName;
    private String city;
    private String state;
    private String country;
    private int pincode;
    private String landMark;

    public Builder houseNo(final int houseNo) {
      this.houseNo = houseNo;
      return this;
    }

    public Builder streetName(final String streetName) {
      this.streetName = streetName;
      return this;
    }

    public Builder city(final String city) {
      this.city = city;
      return this;
    }

    public Builder state(final String state) {
      this.state = state;
      return this;
    }

    public Builder country(final String country) {
      this.country = country;
      return this;
    }

    public Builder pincode(final int pincode) {
      this.pincode = pincode;
      return this;
    }

    public Builder landMark(final String landMark) {
      this.landMark = landMark;
      return this;
    }

    public Address build() {
      return new Address(this);
    }
  }
}
