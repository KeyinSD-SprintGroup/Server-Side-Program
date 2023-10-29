package com.keyin.aircraft;

import com.keyin.airport.Airport;
import com.keyin.passenger.Passenger;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private static long nextId = 0;
    private long id = nextId();
    private String type;
    private String airlineName;
    private Integer numberOfPassengers;
    private List<Passenger> passengerList;
    private List<Airport> airportList;

    private long nextId() {
        long thisId = nextId;
        nextId ++;
        return thisId;
    }

    public void appendAirport(Airport airport) {
        if (airportList == null) {
            airportList = new ArrayList<>();
        }
        airportList.add(airport);
    }

    public List<Airport> getAirportList() {
        if (airportList == null) {
            airportList = new ArrayList<>();
        }
        return airportList;
    }
    public void appendPassenger(Passenger passenger) {
        if (passengerList == null) {
            passengerList = new ArrayList<>();
        }
        passengerList.add(passenger);
    }
    public List<Passenger> getPassengerList() {
        if (passengerList == null) {
            passengerList = new ArrayList<>();
        }
        return passengerList;
    }
    public Long getId() {
        return id;
    }

//    public void setId(long id) {
//        if (id < 0) {
//            throw new IllegalArgumentException("id must be 0 or greater");
//        }
//        this.id = id;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers < 0) {
            throw new IllegalArgumentException("Number of passengers must be 0 or greater");
        }
        this.numberOfPassengers = numberOfPassengers;
    }
}
