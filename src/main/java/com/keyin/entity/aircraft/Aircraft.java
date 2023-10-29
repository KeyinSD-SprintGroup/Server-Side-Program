package com.keyin.entity.aircraft;

import com.keyin.entity.airport.Airport;
import com.keyin.entity.passenger.Passenger;
import com.keyin.utility.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class Aircraft {
    private static final IdGenerator idGenerator = new IdGenerator();
    private final long id = idGenerator.getNextId();
    private String type;
    private String airlineName;
    private Integer numberOfPassengers;
    private List<Passenger> passengerList;
    private List<Airport> airportList;

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
    public long getId() {
        return id;
    }

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
