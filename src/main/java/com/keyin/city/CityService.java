package com.keyin.city;

import com.keyin.airport.Airport;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public List<City> findCityByParameters(CitySearchParameters citySearchParameters) {
        List<City> searchResults = new ArrayList<>();

        for (City city : cityList) {
            if (citySearchParameters.getId() != null &&
                    !Objects.equals(city.getId(), citySearchParameters.getId())) {
                continue;
            }
            if (citySearchParameters.getName() != null &&
                    !city.getName().equalsIgnoreCase(citySearchParameters.getName())) {
                continue;
            }
            if (citySearchParameters.getState() != null &&
                    !city.getState().equalsIgnoreCase(citySearchParameters.getState())) {
                continue;
            }

            searchResults.add(city);
        }
        return searchResults;
    }
}
