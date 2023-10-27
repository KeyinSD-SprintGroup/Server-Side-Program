package com.keyin.airport;

import com.keyin.aircraft.Aircraft;
import com.keyin.aircraft.AircraftSearchParameters;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public List<Airport> findAirportByParameters(AirportSearchParameters airportSearchParameters) {
        List<Airport> searchResults = new ArrayList<>();

        for (Airport airport : airportList) {
            if (airportSearchParameters.getId() != null &&
                    !Objects.equals(airport.getId(), airportSearchParameters.getId())) {
                continue;
            }
            if (airportSearchParameters.getName() != null &&
                    !airport.getName().equalsIgnoreCase(airportSearchParameters.getName())) {
                continue;
            }
            if (airportSearchParameters.getCode() != null &&
                    !airport.getCode().equalsIgnoreCase(airportSearchParameters.getCode())) {
                continue;
            }
            searchResults.add(airport);
        }
        return searchResults;
    }
}
