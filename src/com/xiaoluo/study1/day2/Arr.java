package com.xiaoluo.study1.day2;

import java.util.*;

public class Arr {
    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length/2; i++) {
            char temp;
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return new String(arr);
    }

    //求并集
    private static Integer[] getB(Integer[] m, Integer[] n)
    {
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(m));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(n));

        set1.addAll(set2);

        Integer[] arr = {};
        return set1.toArray(arr);
    }

    //求交集
    private static Float[] getJ(Float[] m, Float[] n)
    {
        List<Float> rs = new ArrayList<Float>();

        Set<Float> set = new HashSet<Float>(Arrays.asList(m.length > n.length ? m : n));

        for (Float i : m.length > n.length ? n : m)  {
            if (set.contains(i))  {
                rs.add(i);
            }
        }

        Float[] arr = {};
        return rs.toArray(arr);
    }

    public static void main(String[] args) {

        String str = "我 爱 你 中 国";
        System.out.println(reverse(str));

        Integer[] m = { 0, 2, 5, 9 };
        Integer[] n = { 5, 9 };
        Integer[] b = getB(m, n);
        System.out.print("并集为: ");
        for (Integer i : b)  {
            System.out.print(i + " ");
        }
        System.out.println();

        Float[] i = {0.3F, 1.2F, 2.2F, 3.3F, 4.4F, 5.8F};
        Float[] j = {0.5F, 1.2F, 2.2F, 3.3F, 4.4F, 6.8F};
        Float[] a = getJ(i,j);
        System.out.print("交集为: ");
        for (Float q : a) {
            System.out.print(q + " ");
        }
        System.out.println();
    }
}
