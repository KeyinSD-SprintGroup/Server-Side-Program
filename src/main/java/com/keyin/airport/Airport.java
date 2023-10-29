package com.keyin.airport;

import com.keyin.city.City;

public class Airport {
    private static long nextId = 0;
    private long id = nextId();
    private String name;
    private String code;
    private City city;

    private long nextId() {
        long thisId = nextId;
        nextId ++;
        return thisId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

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
