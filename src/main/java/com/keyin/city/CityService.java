package com.keyin.city;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    private ArrayList<City> cityList = new ArrayList<City>();

    public List<City> getAllCity(){
        return cityList;
    }

    public City createCity(City city) {
        cityList.add(city);
        return city;
    }
}
