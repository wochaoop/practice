package com.IharaYuki;

public class DiGuiApp {
    public static void main(String[] args) {
        System.out.println(fun(4));
    }
    static int fun(int n){
        return (n == 1)? 1 : n*fun(n-1);
    }
}
