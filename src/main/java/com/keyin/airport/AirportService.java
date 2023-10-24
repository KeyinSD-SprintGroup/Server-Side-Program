package com.keyin.airport;

import com.keyin.aircraft.Aircraft;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {
    private ArrayList<Airport> airportList = new ArrayList<Airport>();

    public List<Airport> getAllAirport() {
        return new ArrayList<Airport>();
    }
}
