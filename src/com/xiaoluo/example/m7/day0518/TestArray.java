package com.xiaoluo.example.m7.day0518;

public class TestArray {

    public static void main(String[] args) {
        info[][] ary = new info[3][];

        ary[0] = new info[2];//二维数组的第一个元素赋值了一个含有两个元素的一维数组

        info info1 = new info();
        info1.id = 1;
        info1.name = "name1";
        ary[0][0] = info1;

        info info2 = new info();
        info2.id = 2;
        info2.name = "name2";
        ary[0][1] = info2;

        ary[1] = new info[3];//二维数组的第二个元素数值了一个含有三个元素的一维数组

        info info3 = new info();
        info3.id = 3;
        info3.name = "name3";
        ary[1][0] = info3;

        info info4 = new info();
        info4.id = 4;
        info4.name = "name4";
        ary[1][1] = info4;

        info info5 = new info();
        info5.id = 5;
        info5.name = "name5";
        ary[1][2] = info5;

        info mininfo = ary[0][0];
        for (int index = 0; index < ary.length; index++) {
            info[] ary2 = ary[index];
            for (int i = 0; i < ary2.length; i++) {
                info info = ary2[i];
                if (info == null)
                    continue;
                if (mininfo == null) {
                    mininfo = info;
                    continue;
                }
                mininfo = (mininfo.id > info.id) ? info : mininfo;
            }
        }
    }
}
