package com.keyin.aircraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class AircraftController {
    @Autowired
    private AircraftService aircraftService;

    @GetMapping("/aircraft")
    public List<Aircraft> getAllAircraft(){
        return aircraftService.getAllAircraft();
    }

    @GetMapping("/aircraft_search")
    public List<Aircraft> getAircraftByParameters(
            @RequestParam(required = false) Long id,
            @RequestParam(required = false)  String type,
            @RequestParam(required = false) String airlineName,
            @RequestParam(required = false) Integer numberOfPassengers) {
        AircraftSearchParameters aircraftSearchParameters = new AircraftSearchParameters();
        try {
            if (id != null) {
                aircraftSearchParameters.setId(id);
            }
            if (type != null) {
                aircraftSearchParameters.setType(type);
            }
            if (airlineName != null) {
                aircraftSearchParameters.setAirlineName(airlineName);
            }
            if (numberOfPassengers != null) {
                aircraftSearchParameters.setNumberOfPassengers(numberOfPassengers);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
            return new ArrayList<>();
        }
        return aircraftService.findAircraftBySearchParameters(aircraftSearchParameters);
    }

    @PostMapping("/aircraft")
    public Aircraft createNewAircraft(@RequestBody Aircraft aircraft) {
        return aircraftService.createAircraft(aircraft);
    }
}
