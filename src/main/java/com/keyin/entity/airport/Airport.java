package com.keyin.entity.airport;

import com.keyin.entity.city.City;
import com.keyin.utility.IdGenerator;

public class Airport {
    private static final IdGenerator idGenerator = new IdGenerator();
    private final long id = idGenerator.getNextId();
    private String name;
    private String code;
    private City city;


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
