package com.keyin.entity.airport;

import com.keyin.entity.city.City;
import com.keyin.utility.IdGenerator;

public class Airport {
    private static final IdGenerator idGenerator = new IdGenerator();
    private final long id = idGenerator.getNextId();
    private String name;
    private String code;
    private long cityId;


    public Long getCityId() {
        return cityId;
    }

    public void setCityId(long id) {
        this.cityId = id;
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
