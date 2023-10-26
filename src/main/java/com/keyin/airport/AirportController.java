package com.keyin.airport;

import com.keyin.aircraft.Aircraft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AirportController {
    @Autowired
    private AirportService airportService;

    @GetMapping("/airport")
    public List<Airport> getAllAirport(){
        return airportService.getAllAirport();
    }

    @PostMapping("/airport")
    public Airport createNewAirport(@RequestBody Airport airport) {
        return airportService.createAirport(airport);
    }
}
