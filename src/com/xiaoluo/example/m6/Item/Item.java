package com.xiaoluo.example.m6.Item;

import top.xiwangly.test.Test1;

public class Item {
    public Item findMin(Item[] ary) {
        if(ary == null)
            return null;
        if (ary.length <= 0)
            return null;

        Item minItem = ary[0];
        for (Item item1 : ary) {
            minItem = (minItem.nvalue > item1.nvalue)?item1:minItem;
        }
        return minItem;
    }

    public String[] insert (String[] arr,int index,String val) {
        String[] newArr = new String[arr.length + 1];
        for (int i = 0; i < index; i++){
            newArr[i] = arr[i];
        }
        newArr[index] = val;
        for (int i = index;i < arr.length;i++) {
            newArr[++index] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        String[] arr = new String[] {

        }


        Item[] ary = new Item[4];
        Test1Array
    }
}
