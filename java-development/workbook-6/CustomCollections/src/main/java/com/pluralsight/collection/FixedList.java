package com.pluralsight.collection;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        if(maxSize <=0){
            System.out.println("Max size has to be greater than zero");
        }
        this.items = new ArrayList<>(maxSize);
        this.maxSize = maxSize;
    }

    public void add(T item){
        if(items.size()<maxSize){
            items.add(item);
        }else {

            throw new IllegalStateException("Array is already full");
        }
    }

    public List<T> getItems(){
        return items;
    }
}
