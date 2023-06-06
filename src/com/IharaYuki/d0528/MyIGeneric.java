package com.IharaYuki.d0528;

import java.util.Random;

public class MyIGeneric implements IGeneric<String>{
    private String[] ary = new String[]{"A","B","C"};

    @Override
    public String next() {
        Random random =new Random();
        int index =random.nextInt(3);
        return ary[index];
    }

    public static void main(String[] args) {
        MyIGeneric myIGeneric =new MyIGeneric();
        myIGeneric.next();

    }

}
