package com.PracticalTraining.N2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Task2 {
    public static String[] reverseSortStringArrays(String[] array1, String[] array2) {
        String[] mergedArray = new String[array1.length + array2.length];
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        Arrays.sort(mergedArray, Collections.reverseOrder());

        return mergedArray;
    }
    public static int[] findIntersection(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for (int num : array2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        int[] result = new int[intersection.size()];
        int index = 0;
        for (int num : intersection) {
            result[index++] = num;
        }

        return result;
    }

    public static double[] findUnion(double[] array1, double[] array2) {
        HashSet<Double> union = new HashSet<>();
        for (double num : array1) {
            union.add(num);
        }

        for (double num : array2) {
            union.add(num);
        }

        double[] result = new double[union.size()];
        int index = 0;
        for (double num : union) {
            result[index++] = num;
        }

        return result;
    }
    public static void main(String[] args) {
        String[] array1 = {"中", "国"};
        String[] array2 = {"我", "爱", "你"};

        String[] reversedSortedArray = reverseSortStringArrays(array1, array2);

        System.out.println("字符串翻转: " + Arrays.toString(reversedSortedArray));
        int[] intArray1 = {1, 2, 3, 4, 5};
        int[] intArray2 = {2, 5, 6, 9};
        System.out.println("交集为: " + Arrays.toString(findIntersection(intArray1, intArray2)));

        double[] doubleArray1 = {1.2, 2.2, 3.3, 4.4};
        double[] doubleArray2 = {2.2, 3.3};
        System.out.println("并集为: " + Arrays.toString(findUnion(doubleArray1, doubleArray2)));

    }
}
