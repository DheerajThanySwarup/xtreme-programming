package com.empPhone;

public class Building {
    private String builder;
    private String houseNo;
    private String city;
    private String pincode;
    private String state;
    private String country;

    public Building(String builder, String houseNo, String city,
                    String pincode, String state, String country) {
        this.builder = builder;
        this.houseNo = houseNo;
        this.city = city;
        this.pincode = pincode;
        this.state = state;
        this.country = country;
    }
}