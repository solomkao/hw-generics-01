package com.solomka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<T extends Number> {
    private List<T> list = new ArrayList<>();

    public void add(T element) {
        if (this.list != null) {
            this.list.add(element);
        }
    }

    public T getSmallest() {
        if (list != null && this.list.size() > 0) {
            T[] newArray = this.list.toArray((T[]) new Number[0]);
            Arrays.sort(newArray);
            return newArray[0];
        }
        return null;
    }

    public T getLargest() {
        if (list != null && this.list.size() > 0) {
            T[] newArray = this.list.toArray((T[]) new Number[0]);
            Arrays.sort(newArray);
            return newArray[newArray.length - 1];
        }
        return null;
    }

    public void display() {
        if (this.list == null || this.list.size() == 0) {
            System.out.println("Empty list!");
        }
        for (T t : list) {
            System.out.print("[" + t + "] ");
        }
        System.out.println();
    }
}
