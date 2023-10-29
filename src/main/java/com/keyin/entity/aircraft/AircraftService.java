package com.keyin.entity.aircraft;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class AircraftService {
    private final List<Aircraft> aircraftList = new ArrayList<>();

    public List<Aircraft> getAllAircraft() {
        return aircraftList;
    }

    public Aircraft createAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
        return aircraft;
    }

    public List<Aircraft> findAircraftByParameters(AircraftSearchParameters aircraftSearchParameters) {
        List<Aircraft> searchResults = new ArrayList<Aircraft>();

        for (Aircraft aircraft : aircraftList) {
            if (aircraftSearchParameters.getId() != null &&
                    !Objects.equals(aircraft.getId(), aircraftSearchParameters.getId())) {
                continue;
            }
            if (aircraftSearchParameters.getType() != null &&
                    !aircraft.getType().equalsIgnoreCase(aircraftSearchParameters.getType())) {
                continue;
            }
            if (aircraftSearchParameters.getAirlineName() != null &&
                    !aircraft.getAirlineName().equalsIgnoreCase(aircraftSearchParameters.getAirlineName())) {
                continue;
            }
            if (aircraftSearchParameters.getNumberOfPassengers() != null &&
                    !Objects.equals(aircraft.getNumberOfPassengers(), aircraftSearchParameters.getNumberOfPassengers())) {
                continue;
            }
            searchResults.add(aircraft);
        }
        return searchResults;
    }
}
