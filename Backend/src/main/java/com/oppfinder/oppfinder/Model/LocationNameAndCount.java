package com.oppfinder.oppfinder.Model;

public class LocationNameAndCount {
    private String name;
    private int count;


    public LocationNameAndCount() {

    }

    public LocationNameAndCount(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
