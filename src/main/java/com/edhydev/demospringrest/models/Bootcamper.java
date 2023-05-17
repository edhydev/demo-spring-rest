package com.edhydev.demospringrest.models;

public class Bootcamper {
    private String name;
    private double id;

    public Bootcamper() {
        this.id = Math.random();
    }

    public Bootcamper(String name, double id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
}
