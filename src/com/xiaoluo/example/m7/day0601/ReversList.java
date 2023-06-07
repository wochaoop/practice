package com.xiaoluo.example.m7.day0601;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReversList<T> implements Iterable<T> {

    public List<T> list = new ArrayList<T>();
    public void add(T t) {
        list.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    class ReversListIterator implements Iterator<T> {
        private int index;
        public ReversListIterator(int index) {
            index = ReversList.this.list.size();
        }

        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public T next() {
            index--;
            return ReversList.this.list.get(index);
        }
    }
}
