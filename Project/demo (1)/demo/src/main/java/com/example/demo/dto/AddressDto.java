package com.example.demo.dto;

public class AddressDto {

    private char addressType;
    private String street;
    private String city;
    private String state;

    public AddressDto(char addressType, String street, String city, String state, String country) {
        this.addressType = addressType;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    private String country;

    public char getAddressType() {
        return addressType;
    }

    public void setAddressType(char addressType) {
        this.addressType = addressType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
