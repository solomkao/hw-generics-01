package com.solomka;

public class MyThirdList<T extends Comparable<T>> {
    private T[] array;

    public MyThirdList(T[] array) {
        this.array = array;
    }

    public T getHighest() {
        if (this.array != null && this.array.length > 0) {
            T element = this.array[0];
            for (int i = 0; i < this.array.length; i++) {
                if (this.array[i].compareTo(element) >= 0) {
                    element = this.array[i];
                }
            }
            return element;
        }
        return null;
    }

    public T getLowest() {
        if (this.array != null && this.array.length > 0) {
            T element = this.array[0];
            for (int i = 0; i < this.array.length; i++) {
                if (this.array[i].compareTo(element) <= 0) {
                    element = this.array[i];
                }
            }
            return element;
        }
        return null;
    }

    public void display() {
        if (this.array == null || this.array.length == 0) {
            System.out.println("Empty list!");
        }
        for (T t : array) {
            System.out.print("[" + t + "] ");
        }
        System.out.println();
    }
}
