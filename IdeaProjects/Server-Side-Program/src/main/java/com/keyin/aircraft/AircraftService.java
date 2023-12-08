package com.keyin.aircraft;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AircraftService {
    private ArrayList<Aircraft> aircraftList = new ArrayList<Aircraft>();

    public List<Aircraft> getAllAircraft() {
        return new ArrayList<Aircraft>();
    }
}
