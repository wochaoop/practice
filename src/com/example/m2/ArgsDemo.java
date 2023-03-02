package com.example.m2;

public class ArgsDemo {
    public static void main(String args[ ]){
    int sum = 0;
    for(int cnt = 0; cnt < args.length; cnt++)
        sum+=Integer.parseInt(args[cnt]);
    System.out.println("和为："+sum);
}

}
