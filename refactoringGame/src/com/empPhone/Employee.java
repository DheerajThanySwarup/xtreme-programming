package com.empPhone;

public class Employee {
    private int id;
    private int name;
    private Address address;
    private PhoneNumber phoneNumber;

    public Employee(int id, int name,PhoneNumber phoneNumber, Address address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}

