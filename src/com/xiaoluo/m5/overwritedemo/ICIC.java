package com.xiaoluo.m5.overwritedemo;

public class ICIC extends Bank {
    float fRate = 7.0f;

    @Override
    public float getRate() {
        return fRate;
    }
}
