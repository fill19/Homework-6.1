package com.Cursor.java;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Grey");
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        System.out.println("Few colors " + colors);

        System.out.println("\nTask 2");
        Iterator typOfColors = colors.iterator();
        System.out.println("Each color in array:");
        while (typOfColors.hasNext()) {
            System.out.println(typOfColors.next());
        }

        System.out.println("\nTask 3");
        TreeSet<String> newColors = new TreeSet<>();
        newColors.add("Green");
        newColors.add("Yellow");
        newColors.add("Blue");
        List<String> together = new ArrayList<>();
        together.addAll(colors);
        together.addAll(newColors);
        System.out.println("All colors of arrays together " + together);

        System.out.println("\nTask 4");
        Iterator someColors = colors.descendingIterator();
        System.out.println("Colors in reversed array:");
        while (someColors.hasNext()) {
            System.out.println(someColors.next());
        }

        System.out.println("\nTask 5");
        Object theFirstColor = colors.first();
        Object theLastColor = colors.last();
        System.out.println("The first color: " + theFirstColor);
        System.out.println("the last color: " + theLastColor);

        System.out.println("\nTask 6");
        TreeSet<String> cloned = (TreeSet<String>) colors.clone();
        System.out.println("Cloned array: " + colors);

        System.out.println("\nTask 7");
        System.out.println("The numbers of colors " + colors.size());

        System.out.println("\nTask 8");
        TreeSet<String> compare = new TreeSet<>();
        for (String gain : colors)
            compare.add(newColors.contains(gain) ? "Yes" : "No"); 
        System.out.println(compare);


        System.out.println("\nTask 9");
        TreeSet<Integer> numbs = new TreeSet<>();
        numbs.add(4);
        numbs.add(534);
        numbs.add(6);
        numbs.add(64);
        numbs.add(8);
        Iterator<Integer> iterator = numbs.iterator();
        System.out.print("Tree set data: ");

        // Displaying the Tree set data
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); //?????????????
        }

        System.out.println("\nTask 10");
        System.out.println("Ceiling value for 8: " + numbs.ceiling(8));

        System.out.println("\nTask 11");
        System.out.println(" Less value for 8: " + numbs.floor(8));

        System.out.println("\nTask 12");
        System.out.println("The numbers which strictly higher than 8: " + numbs.higher(8));

        System.out.println("\nTask 13");
        System.out.println("The numbers which strictly lower than 8: " + numbs.lower(8));

        System.out.println("\nTask 14");
        numbs.pollFirst();
        System.out.println("The array without first number: " + numbs);


        System.out.println("\nTask 15");
        numbs.pollLast();
        System.out.println("The array without last number: " + numbs);

        System.out.println("\nTask 16");
        numbs.remove(6);
        System.out.println("The array without 6: " + numbs);
    }
}
