package com.keyin.city;

public class City {
    private static long nextId;
    private long id = nextId();
    private String name;
    private String state;
    private int population;

    private long nextId() {
        long thisId = nextId;
        nextId ++;
        return thisId;
    }

    public long getId() {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
