package com.xiaoluo.m5.overwritedemo;

public class SBI extends Bank {
    float fRate = 8.0f;

    @Override
    public float getRate() {
        return fRate;
    }
}
