package com.xiaoluo.example.m7.day0525;

import java.util.Random;

public class MyIGeneric implements IGeneric<String > {

    private String[] ary = new String[] {"A","B","C"};

    public static void main(String[] args) {
        MyIGeneric myIGeneric = new MyIGeneric();
        myIGeneric.next();
        myIGeneric.next();
        System.out.println();
    }

    @Override
    public String next() {
        Random random = new Random();
        int index = random.nextInt(3);
        return ary[index];
    }
}
