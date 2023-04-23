package com.example.m5.overwritedemon;

import com.example.m5.Person;

public class Emp extends Person {
    private String job;

    public Emp(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }
}
