package com.solomka;

import java.util.ArrayList;
import java.util.List;

public class MySecondList<T extends Comparable<T>> {
    private List<T> list = new ArrayList<>();

    public void add(T element) {
        if (list != null) {
            list.add(element);
        }
    }

    public T remove(int index) {
        if (list != null && list.size() > index) {
            return list.remove(index);
        }
        return null;
    }

    public T getSmallest() {
        if (this.list != null && this.list.size() > 0) {
            T smallest = this.list.get(0);
            for (T element : this.list) {
                if (smallest.compareTo(element) > 0) {
                    smallest = element;
                }
            }
            return smallest;
        }
        return null;
    }

    public T getLargest() {
        if (this.list != null && this.list.size() > 0) {
            T largest = this.list.get(0);
            for (T element : this.list) {
                if (largest.compareTo(element) < 0) {
                    largest = element;
                }
            }
            return largest;
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
