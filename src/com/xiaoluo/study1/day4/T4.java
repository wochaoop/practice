package com.xiaoluo.study1.day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class T4 {
    public static void main(String[] args) {
        Random r = new Random(); //定义一个随机数对象
        ArrayList l = new ArrayList(); //定义一个集合对象
        for(int i = 0; i < 20 ; i++) {//将随机数赋给集合
            int i1 = r.nextInt(99);
            l.add(i1);
        }
        Iterator it=l.iterator();//获取Iterator对象
        while(it.hasNext()) {//判断集合中是否存在下一个元素
            Object obj = it.next(); //取出集合中的元素
            System.out.print(obj + " ");
        }
    }
}
