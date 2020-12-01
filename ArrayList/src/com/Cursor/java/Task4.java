package com.Cursor.java;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        HashSet<String> jobs = new HashSet<>();
        jobs.add("Coder");
        jobs.add("Doctor");
        jobs.add("Plumber");
        jobs.add("Pilot");
        jobs.add("Builder");
        System.out.println("HashSet array: " + jobs);

        System.out.println("\nTask 2:");
        Iterator professions = jobs.iterator();
        System.out.println("Each element in array:");
        while (professions.hasNext()) {
            System.out.println(professions.next());


        }

        System.out.println("\nTask 3:");
        System.out.println("The number of elements in array: " + jobs.size());

        System.out.println("\nTask 4:");
        jobs.removeAll(jobs);
        System.out.println("Array is empty now: " + jobs);

        System.out.println("\nTask 5:");
        System.out.println("That array is empty: " + jobs.isEmpty());

        System.out.println("\nTask 6:");
        jobs.add("Coder");
        jobs.add("Doctor");
        jobs.add("Plumber");
        jobs.add("Pilot");
        jobs.add("Builder");

        HashSet<String> cloned = (HashSet<String>) jobs.clone();
        System.out.println("Cloned array: " + cloned);

        System.out.println("\nTask 7:");
        ArrayList<String> convert = new ArrayList<>(jobs);
        for (String massive : convert) {
            System.out.println(massive);
        }

        System.out.println("\nTask 8:");
        TreeSet<String> newConvert = new TreeSet<>(jobs);
        for (String secondMassive : newConvert) {
            System.out.println(secondMassive);
        }

        System.out.println("\nTask 9:");
        LinkedList<String> anotherNewConvert = new  LinkedList<>(jobs);
        for (String thirdMassive : anotherNewConvert) {
            System.out.println(thirdMassive);
        }

    }
}
