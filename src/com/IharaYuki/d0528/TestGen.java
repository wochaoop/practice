package com.IharaYuki.d0528;
import com.IharaYuki.day0523.Stu;
public class TestGen {
    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<Integer>(1);
        System.out.println(generic.getKey());

        Generic<Stu> generic1 =new Generic<Stu>(new Stu());
        System.out.print(generic1.getKey());

        Generic4Fun generic4Fun = new Generic4Fun();
        Integer fun = generic4Fun.fun(new Integer[]{1, 2});
        generic4Fun.fun(new String[]{"A","B"});
    }

}
