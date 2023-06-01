package com.xiaoluo.example.m7.day0523;

import java.util.Arrays;
import java.util.Comparator;

public class TestBubbleSort {

	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort(10);
		Stu stu1 = new Stu();
		stu1.name = "name1";
		stu1.cs_score = 88;
		stu1.math_score = 90;
		bubbleSort.insertElement(stu1);
		
		Stu stu2 = new Stu();
		stu2.name = "name2";
		stu2.cs_score = 85;
		stu2.math_score = 88;
		bubbleSort.insertElement(stu2);
		
		Stu stu3 = new Stu();
		stu3.name = "name3";
		stu3.cs_score = 80;
		stu3.math_score = 85;
		bubbleSort.insertElement(stu3);
		
		bubbleSort.display();

		bubbleSort.sort();
		bubbleSort.display();

		bubbleSort.sort2();
		bubbleSort.display();

		Integer[] a1 = new Integer[3];
		a1[0] = 1;
		a1[1] = 2;
		a1[2] = 3;

		Arrays.sort(a1,0,3, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});

		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	}

}
