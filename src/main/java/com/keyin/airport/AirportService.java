package com.keyin.airport;

import com.keyin.aircraft.Aircraft;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {
    private final ArrayList<Airport> airportList = new ArrayList<Airport>();

    public List<Airport> getAllAirport() {
        return airportList;
    }

    public Airport createAirport(Airport airport) {
        airportList.add(airport);
        return airport;
    }
}
