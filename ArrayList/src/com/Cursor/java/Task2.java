package com.Cursor.java;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        LinkedList<String> nationality = new LinkedList<>();
        nationality.add("German");
        nationality.add("Italian");
        nationality.add("Ukrainian");
        nationality.add("Francine");
        nationality.add("Canadian");
        System.out.println("Elements of LinkedList: " + nationality);


        System.out.println("\nTask 2:");
        Iterator citizenShip = nationality.iterator();
        System.out.println("Each element in array:");
        while (citizenShip.hasNext()) {
            System.out.println(citizenShip.next());
        }

        System.out.println("\nTask 3:");
        Iterator nation = nationality.listIterator(2);
        while (nation.hasNext()) {
            System.out.println(nation.next());
        }

        System.out.println("\nTask 4:");
        Collections.reverse(nationality);
        System.out.println("Reversed array: " + nationality);

        System.out.println("\nTask 5:");
        nationality.add(3, "Indian");
        System.out.println("New nation in array: " + nationality);

        System.out.println("\nTask 6:");
        nationality.addFirst("Spanish");
        nationality.addLast("American");
        System.out.println("First and Last nationality in array: " + nationality);

        System.out.println("\nTask 7:");
        nationality.offerFirst("Chinese");
        System.out.println("Chinese at the beginning of the array: " + nationality);

        System.out.println("\nTask 8:");
        nationality.offerLast("Russian");
        System.out.println("Russian at the end of the array: " + nationality);

        System.out.println("\nTask 9:");
        nationality.add(4, "Kazakh");
        nationality.add(5, "Mongolian");
        System.out.println("One more element into array: " + nationality);

        System.out.println("\nTask 10:");
        System.out.println("First occurrence in array: " + nationality.indexOf("Spanish"));
        System.out.println("Last occurrence in array: " + nationality.lastIndexOf("Australian"));

        System.out.println("\nTask 11:");
        for (int i = 0; i < nationality.size(); i++) {
            System.out.println("All elements with index: " + i + ": " + nationality.get(i));
        }
        System.out.println("All elements in array: " + nationality.size());


        System.out.println("\nTask 12:");
        nationality.remove("Chinese");
        System.out.println("Array with removed nationality: " + nationality);

        System.out.println("\nTask 13:");
        nationality.removeFirst();
        nationality.removeLast();
        System.out.println("Array with removed nationalities: " + nationality);

        System.out.println("\nTask 14:");
        nationality.removeAll(nationality);
        System.out.println("All removed nationalities: " + nationality);

        System.out.println("\nTask 15:");
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Lvov");
        cities.add("Paris");
        cities.add("Kiev");
        cities.add("New-York");
        cities.add("London");
        Collections.swap(cities, 2, 4);
        System.out.println("Swapping two cities in massive: " + cities);

        System.out.println("\nTask 16:");
        Collections.shuffle(cities);
        System.out.println("Shuffled array: " + cities);

        System.out.println("\nTask 17:");
        LinkedList<String> country = new LinkedList<>();
        country.add("Ukraine");
        country.add("France");
        country.add("England");
        country.add("USA");

        LinkedList<String> together = new LinkedList<>();
        together.addAll(cities);
        together.addAll(country);
        System.out.println("All together: " + together);

        System.out.println("\nTask 18:");
        LinkedList<String> cloned = (LinkedList<String>) cities.clone();
        System.out.println("Cloned array: " + cloned);

        System.out.println("\nTask 19:");
        System.out.println("Array without first city: " + cities.pollFirst());
        System.out.println(cities);

        System.out.println("\nTask 20:");
        String cities_get = cities.peekFirst();
        System.out.println("Retrieve the element: " + cities_get);
        System.out.println(cities);

        System.out.println("\nTask 21:");
        String citiesGet = cities.peekLast();
        System.out.println("Retrieve the element: " + citiesGet);
        System.out.println(cities);

        System.out.println("\nTask 22:");
        if (cities.contains("Lvov")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println("\nTask 23:");
        ArrayList<String> convert = new ArrayList<>(cities);
        for (String massive : convert) {
            System.out.println(massive);

        }

        System.out.println("\nTask 24:");
        LinkedList<String> compare = new LinkedList<>();
        for (String well : cities)
            compare.add(country.contains(well) ? "Yes" : "No");
        System.out.println(compare);

        System.out.println("\nTask 25:");
        System.out.println("Check the above linked list is empty or not! " + cities.isEmpty());
        System.out.println("Linked list after remove all elements " + cities);

        System.out.println("\nTask 26:");
        cities.set(3, "Kharkov");
        System.out.println("Replaced Lvov from array: " + cities);

    }
}

