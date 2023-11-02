package com.keyin.entity.aircraft;

import com.keyin.entity.airport.Airport;
import com.keyin.entity.airport.AirportService;
import com.keyin.entity.passenger.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class AircraftController {
    private final AircraftService aircraftService;


    @Autowired
    public AircraftController(AircraftService aircraftService){
        this.aircraftService = aircraftService;
    }

    @GetMapping("/aircraft")
    public List<Aircraft> getAllAircraft(){
        return aircraftService.getAllAircraft();
    }

    @GetMapping("/aircraft_by_id")
    public Aircraft getAircraftById(
            @RequestParam Long id) {
        if (aircraftService.getAircraftById(id) != null) {
            return aircraftService.getAircraftById(id);
        } else return null;
    }

    @GetMapping("/aircraft_search")
    public List<Aircraft> getAircraftByParameters(
            @RequestParam(required = false) Long id,
            @RequestParam(required = false)  String type,
            @RequestParam(name = "airlinename", required = false) String airlineName,
            @RequestParam(name = "numberofpassengers", required = false) Integer numberOfPassengers){
        AircraftSearchParameters aircraftSearchParameters = new AircraftSearchParameters();
        try {
            if (id != null) {
//                System.out.println(id);
                aircraftSearchParameters.setId(id);
            }
            if (type != null) {
//                System.out.println(type);
                aircraftSearchParameters.setType(type);
            }
            if (airlineName != null) {
//                System.out.println(airlineName);
                aircraftSearchParameters.setAirlineName(airlineName);
            }
            if (numberOfPassengers != null) {
//                System.out.println(numberOfPassengers);
                aircraftSearchParameters.setNumberOfPassengers(numberOfPassengers);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
            return new ArrayList<>();
        }
//        System.out.println(aircraftSearchParameters); //For debugging
        return aircraftService.findAircraftByParameters(aircraftSearchParameters);
    }

    @PostMapping("/aircraft")
    public Aircraft createNewAircraft(@RequestBody Aircraft aircraft) {
        return aircraftService.createAircraft(aircraft);
    }
}
