package com.IharaYuki;
import java.util.Scanner;
public class Work8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        int remainder;
        String s = new String();
        if(number >= 0) {
            while (number != 0) {
                remainder = number % 2;
                number /= 2;
                if(remainder != 0)
                    s = s.concat("1");
                else if(remainder ==0)
                    s = s.concat("0");
            }
            System.out.println(new StringBuilder(s).reverse().toString());
        }
        else if(number < 0) {
            int size = 32;
            char[] str = new char[size +1];
            for(int i = size -1;i >= 0; --i,number >>=1) {
                str[i] = (char) ('0' + (1 & number));
            }
            str[size] ='\0';
            System.out.println(str);
        }
    }
}

