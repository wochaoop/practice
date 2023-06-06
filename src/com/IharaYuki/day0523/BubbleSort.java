package com.IharaYuki.day0523;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {
   private Stu[] a;
   private int nElement;

   public BubbleSort(int max) {
	   a = new Stu[max];
	   nElement = 0;
   }

   public void insertElement(Stu nvalue) {
	   if (nElement >= a.length) 
		   return;
	   a[nElement] = nvalue;
	   nElement++;
   }

   public void display() {
	   for(int index = 0; index < nElement;index++) {
		   System.out.print(a[index].name);
		   System.out.print(" ");
		   System.out.print(a[index].cs_score);
		   System.out.print(" ");
		   System.out.print(a[index].math_score);
		   System.out.println();
	   }
	   System.out.println();
   }

   public void sort() {
	   /*for(int i = 0; i < nElement-1;i++) {
		   for(int j = 0; j < nElement-1-i;j++) {
			   if(a[j].cs_score <=  a[j+1].cs_score)
				   continue;
			   Stu temp = a[j];
			   a[j] = a[j+1];
			   a[j+1] = temp;
		   }
	   }*/

	   Arrays.sort(a, 0, nElement, new Comparator<Stu>() {
		   @Override
		   public int compare(Stu o1, Stu o2) {
			   return o1.cs_score - o2.cs_score;
		   }
	   });
   }

   public void sort2() {
	   Arrays.sort(a, 0, nElement, new Comparator<Stu>() {
		   @Override
		   public int compare(Stu o1, Stu o2) {
			   return o1.math_score - o2.math_score;
		   }
	   });
   }
   
}
