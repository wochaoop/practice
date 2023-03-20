package com.xiaoluo;

public class DiGuiApp1 {
    public static void main(String[ ] args){
        System.out.print(fun(4));
    }

    public static int fun(int n){
        if(n == 1){
            return 1;
        }
        return n*fun(n-1);
    }
}
