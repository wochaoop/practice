package com.IharaYuki.T7d0511;

public class TestArray {


    public void initAry(Item[] ary) {
        for (int index = 0; index < ary.length; index++) {
            Item item = new Item();
            item.name = String.valueOf(index);
            item.nvalue = index;
            ary[index] = item;
        }
    }

    public void travAry(Item[] ary) {
        for (Item item : ary) {
            System.out.println("value:" + item.nvalue);
        }
    }

    public Item findMid(Item[] ary) {
        if (ary == null)
            return null;
        if (ary.length <= 0)
            return null;
        Item minItem = ary[0];
        for (Item item1 : ary) {
            minItem = (minItem.nvalue > item1.nvalue) ? item1 : minItem;
        }
        return minItem;
    }
    public String[] insert(String[] arr,int index,String val){
        String[] newArr = new String[arr.length+1];
        for (int i =0 ;i < index ; i++){
            newArr[i] = arr[i];
        }
        newArr[index] = val;
        for (int i = index; i<arr.length; i++){
           newArr[++index] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        Item[] ary = new Item[4];
        String[] arr = new String[]{"A1","A2","A3",};
        TestArray testArray = new TestArray();
        testArray.initAry(ary);
        testArray.travAry(ary);
        testArray.findMid(ary);
        TestArray testArray2 =new TestArray();
        arr = testArray2.insert(arr,1,"A5");
        for (String item:arr) {
            System.out.println(item);
        }
    }
}
