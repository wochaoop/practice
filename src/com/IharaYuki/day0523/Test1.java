package com.IharaYuki.day0523;

import java.util.Arrays;
import java.util.Collections;

public class Test1 {

    public static void main(String[] args) {
        Long[] ary = new  Long[5];
        ary[0] = 5L;
        ary[1] = 4L;
        ary[2] = 3L;
        ary[3] = 2L;
        ary[4] = 1L;

        Arrays.sort(ary, 0 ,3);

        Arrays.sort(ary, Collections.reverseOrder());

        for (int index = 0; index < ary.length; index++) {
            System.out.print(ary[index] + " ");
        }
        System.out.println();
    }
}
