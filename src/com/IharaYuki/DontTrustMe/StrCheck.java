package com.IharaYuki.DontTrustMe;

import java.util.Scanner;

public class StrCheck {
    public static void main(String[] args) {
        int upperCount = 0 , lowerCount = 0 , digitCount = 0 , otherCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input:");
        String str = scanner.nextLine();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCount++;
            }else if (Character.isLowerCase(ch)){
                lowerCount++;
            }else if (Character.isDigit(ch)){
                digitCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("大写字母:"+upperCount+"\n"+"小写字母:"+lowerCount+"\n"+"数字:"+digitCount+"\n"+"其他字符:"+otherCount);
    }

}
