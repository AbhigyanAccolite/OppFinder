package com.oppfinder.oppfinder.Model;

public class EmploymentType {
    int id;
    String name;

    public EmploymentType() {

    }

    public EmploymentType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
