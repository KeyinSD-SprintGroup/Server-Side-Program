package com.keyin.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/city")
    public City createNewCity(@RequestBody City city) {
        return cityService.createCity(city);
    }
}
