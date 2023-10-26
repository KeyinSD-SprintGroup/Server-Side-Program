package com.keyin.passenger;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {
    private final ArrayList<Passenger> passengerList = new ArrayList<Passenger>();

    public List<Passenger> getAllPassenger() {
        return passengerList;
    }

    public Passenger createPassenger(Passenger passenger) {
        passengerList.add(passenger);
        return passenger;
    }
}
