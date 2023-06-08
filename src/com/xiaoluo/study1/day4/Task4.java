package com.xiaoluo.study1.day4;

public class Task4 {
    public static void main(String[] args) {
        String str = "Hello World";

        StringBuffer reversedStr = new StringBuffer();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                reversedStr.append(Character.toLowerCase(ch));
            } else {
                reversedStr.append(Character.toUpperCase(ch));
            }
        }

        String result = reversedStr.toString();
        System.out.println(result);
    }
}


