package com.gamer.creational.builder;

public class AccountBuilder {
  public static void main(String[] args) {
    Name name = new Name.Builder().firstName("John").lastName("doe").build();

    Address address =
        new Address.Builder()
            .houseNo(123)
            .streetName("Google street view")
            .city("Venice")
            .state("Italy")
            .country("spain")
            .pincode(567332)
            .landMark("Next to pope's office")
            .build();

    Account account =
        new Account.Builder()
            .name(name)
            .id(1234567)
            .email("thegamer@gmail.com")
            .address(address)
            .build();

    System.out.println(account.getName());
    System.out.println(account.getAccountId());
  }
}
