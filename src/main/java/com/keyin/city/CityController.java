package com.keyin.city;

import com.keyin.airport.Airport;
import com.keyin.airport.AirportSearchParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/city")
    public List<City> getAllCity(){
        return cityService.getAllCity();
    }

    @GetMapping("/city_search")
    public List<City> getCityByParameters(
            @RequestParam(required = false) Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String state) {
        CitySearchParameters citySearchParameters = new CitySearchParameters();
        try {
            if (id != null) {
                System.out.println(id);
                citySearchParameters.setId(id);
            }
            if (name != null) {
                System.out.println(name);
                citySearchParameters.setName(name);
            }
            if (state != null) {
                System.out.println(state);
                citySearchParameters.setState(state);
            }
        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
            return new ArrayList<>();
        }
        System.out.println(citySearchParameters);
        return cityService.findCityByParameters(citySearchParameters);
    }

    @PostMapping("/city")
    public City createNewCity(@RequestBody City city) {
        return cityService.createCity(city);
    }
}
