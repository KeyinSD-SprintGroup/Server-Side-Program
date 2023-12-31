package com.keyin.entity.airport;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping("/airport_by_id")
    public Airport getAirportById(
            @RequestParam Long id) {
        if (airportService.getAirportById(id) != null) {
            return airportService.getAirportById(id);
        } else return null;
    }

    @GetMapping("/airport_search")
    public List<Airport> getAirportByParameters(
            @RequestParam(required = false) Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String code,
            @RequestParam(name = "cityid", required = false) Long cityId) {
        AirportSearchParameters airportSearchParameters = new AirportSearchParameters();
        try {
            if (id != null) {
                System.out.println(id);
                airportSearchParameters.setId(id);
            }
            if (name != null) {
                System.out.println(name);
                airportSearchParameters.setName(name);
            }
            if (code != null) {
                System.out.println("Code: " + code);
                airportSearchParameters.setCode(code);
            }
            if (cityId != null) {
                System.out.println(cityId);
                airportSearchParameters.setCityId(cityId);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
            return new ArrayList<>();
        }
        System.out.println(airportSearchParameters);
        return airportService.findAirportByParameters(airportSearchParameters);
    }

    @PostMapping("/airport")
    public Airport createNewAirport(@RequestBody Airport airport) {
        return airportService.createAirport(airport);
    }
}
