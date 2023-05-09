package com.example.m5;

public class Emp extends Person {
    private String job;

    public Emp(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }
}
