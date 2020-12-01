package com.Cursor.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> colorsType = new ArrayList<>();
        System.out.println("Task 1:");

        colorsType.add("Red");
        colorsType.add("Orange");
        colorsType.add("Purple");
        colorsType.add("Blue");
        colorsType.add("Blue");
        colorsType.add("Green");
        colorsType.add("Yellow");
        System.out.println("Colors of rainbow: " + colorsType);

        System.out.println("\nTask 2:");
        Iterator colors = colorsType.iterator();
        System.out.println("Each element in array:");
        while (colors.hasNext()) {
            System.out.println(colors.next());
        }

        System.out.println("\nTask 3:");
        System.out.println("Colors of rainbow: ");
        colorsType.add(0, "Violet");
        System.out.println(colorsType);

        System.out.println("\nTask 4:");
        System.out.println("Retrieve the element: " +  colorsType.get(3));

        System.out.println("\nTask 5:");
        colorsType.set(5, "light-blue");
        System.out.println("New color is: " + colorsType);

        System.out.println("\nTask 6:");
        colorsType.remove(3);
        System.out.println("New array without third element: " + colorsType);

        System.out.println("\nTask 7:");
        if (colorsType.contains("Violet")) {
            System.out.println("That color in our array");
        }else {
            System.out.println("We haven`t that color in array");
        }

        System.out.println("\nTask 8:");
        Collections.sort(colorsType);
        System.out.println("Sorted array: " + colorsType);

        System.out.println("\nTask 9:");
        ArrayList<String> newColorsType = new ArrayList<>();
        newColorsType.add("Ginger");
        newColorsType.add("Zinger");
        newColorsType.add("Black");
        newColorsType.add("White");
        Collections.copy(colorsType, newColorsType);
        System.out.println("Copy of first array: " + newColorsType);

        System.out.println("\nTask 10:");
        Collections.shuffle(colorsType);
        System.out.println("Shuffled array: " + colorsType);

        System.out.println("\nTask 11:");
        Collections.reverse(colorsType);
        System.out.println("Reversed colors: "  + colorsType);

        System.out.println("\nTask 12:");
        List<String> colorsTypeOf = colorsType.subList(0, 4);
        System.out.println("First 4 colors: " + colorsTypeOf);

        System.out.println("\nTask 13:");
        ArrayList<String> compare = new ArrayList<>();
        for (String e : colorsType)
            compare.add(newColorsType.contains(e) ? "Yes" : "No");
        System.out.println(compare);

        System.out.println("\nTask 14:");
        Collections.swap(colorsType, 0, 4);
        System.out.println("Swapping two colors in massive: " + colorsType);

        System.out.println("\nTask 15:");
        List<String> together = new ArrayList<>();
        together.addAll(colorsType);
        together.addAll(newColorsType);
        System.out.println("All together: " + together);

        System.out.println("\nTask 16:");
        ArrayList<String> cloned = (ArrayList<String>)colorsType.clone();
        System.out.println("Cloned array: " + cloned);

        System.out.println("\nTask 17:");
        newColorsType.removeAll(newColorsType);
        System.out.println("Array is empty now: " + newColorsType);

        System.out.println("\nTask 18:");
        if (colorsType.isEmpty()){
            System.out.println("some colors here");
        }else {
            System.out.println("Any colors in array: ");
        }

        System.out.println("\nTask 19:");
        colorsType.trimToSize();
        System.out.println("Size of array: " + colorsType.size());

        System.out.println("\nTask 20:");
        colorsType.ensureCapacity(9);
        colorsType.add("Cherry");
        colorsType.add("Slight");
        System.out.println("Increasing capacity: " + colorsType);

        System.out.println("\nTask 21:");
        colorsType.add(4, "Blind");
        System.out.println("Changed index: " + colorsType);

        System.out.println("\nTask 22:");
        for(int i=0;i<colorsType.size();i++){
            System.out.println(colorsType.get(i));
            System.out.println("All elements " + colorsType);
        }

    }


}
