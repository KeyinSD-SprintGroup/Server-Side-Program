package com.keyin.entity.passenger;

import com.keyin.utility.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private static final IdGenerator idGenerator = new IdGenerator();
    private final long id = idGenerator.getNextId();
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private long cityId;
    private List<Long> aircraftIdList;


    public long getId() {
        return id;
    }

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

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public List<Long> getaircraftIdList() {
        if (aircraftIdList == null) {
            aircraftIdList = new ArrayList<>();
        }
        return aircraftIdList;
    }
    public void appendAircraft(long id) {
        if (aircraftIdList == null) {
            aircraftIdList = new ArrayList<>();
        }
        if (!aircraftIdList.contains(id)) {
            aircraftIdList.add(id);
        }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", aircraftIdList=" + aircraftIdList +
                '}';
    }
}
