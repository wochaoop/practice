package com.xiaoluo.example.m7.day0525;

import com.xiaoluo.example.m7.day0523.Stu;

public class Test {

    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<Integer>(1);
        System.out.print(generic.getKey());

        Generic<Stu> generic1 = new Generic<Stu>(new Stu());
        System.out.print(generic.getKey());

        //Generic<long> generic2 = new Generic<int>(10);

        Generator4Fun generator4Fun = new Generator4Fun();
        Integer a = generator4Fun.fun(new Integer[] {1,2});
        String s = generator4Fun.fun(new String[] {"A","B"});

    }
}
