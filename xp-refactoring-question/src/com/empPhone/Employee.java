package com.empPhone;

public class Employee {
    private int id;
    private int name;
    private String houseNo;
    private String city;
    private String pincode;
    private String state;
    private String country;
    private String stdCode;
    private String phoneNumber;

    public Employee(int id, int name, String houseNo, String city,
                    String pincode, String state, String country,
                    String stdCode, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.houseNo = houseNo;
        this.city = city;
        this.pincode = pincode;
        this.state = state;
        this.country = country;
        this.stdCode = stdCode;
        this.phoneNumber = phoneNumber;
    }
}

