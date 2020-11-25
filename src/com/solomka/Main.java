package com.solomka;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> listIntegers = new MyList<>();
        MyList<Double> listDoubles = new MyList<>();
        for (int i = 0; i < 15; i++) {
            listIntegers.add(new Random().nextInt(100));
            listDoubles.add(new Random().nextDouble() * 100);
        }
        System.out.println("Integer:");
        listIntegers.display();
        System.out.println("The largest number is " + listIntegers.getLargest());
        System.out.println("The smallest number is " + listIntegers.getSmallest());
        System.out.println("Double:");
        listDoubles.display();
        System.out.printf("The largest number is %.2f\n", listDoubles.getLargest());
        System.out.printf("The smallest number is %.2f\n", listDoubles.getSmallest());

        MySecondList<Integer> listInt = new MySecondList<>();
        for (int i = 0; i < 5; i++) {
            listInt.add(new Random().nextInt(100));
        }
        listInt.display();
        System.out.println("Deleted element " + listInt.remove(3));
        listInt.display();
        System.out.println("The largest number is " + listInt.getLargest());
        System.out.println("The smallest number is " + listInt.getSmallest());

        MySecondList<String> listString = new MySecondList<>();
        listString.add("I");
        listString.add("have");
        listString.add("never");
        listString.add("tried");
        listString.add("it");
        listString.add("before");
        listString.display();
        System.out.println("Deleted element " + listString.remove(0));
        listString.display();
        System.out.println("The largest word is " + listString.getLargest());
        System.out.println("The smallest word is " + listString.getSmallest());

        Integer[] array = {0, 2, 5, 4, -7, 47, 69, 65, -82, 10};
        MyThirdList<Integer> integerMyThirdList = new MyThirdList<>(array);
        integerMyThirdList.display();
        System.out.println("The largest number is " + integerMyThirdList.getHighest());
        System.out.println("The smallest number is " + integerMyThirdList.getLowest());
    }
}
