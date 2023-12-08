package com.keyin.passenger;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {
    private ArrayList<Passenger> passengerList = new ArrayList<Passenger>();

    public List<Passenger> getAllPassenger() {
        return new ArrayList<Passenger>();
    }
}
