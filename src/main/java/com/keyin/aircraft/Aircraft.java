package com.keyin.aircraft;

public class Aircraft {
    private Long id;
    private String type;
    private String airlineName;
    private Integer numberOfPassengers;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if (id < 0) {
            throw new IllegalArgumentException("id must be 0 or greater");
        }
            this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public Integer getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers < 0) {
            throw new IllegalArgumentException("Number of passengers must be 0 or greater");
        }
        this.numberOfPassengers = numberOfPassengers;
    }
}
