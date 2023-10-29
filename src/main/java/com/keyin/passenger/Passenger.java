package com.keyin.passenger;

public class Passenger {
    private static long nextId;
    private long id = nextId();
    private String firstName;
    private String lastName;
    private String phoneNumber;

    private long nextId() {
        long thisId = nextId;
        nextId ++;
        return thisId;
    }

    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
