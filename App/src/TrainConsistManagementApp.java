/*
MAIN CLASS - TrainConsistManagementApp

* Use Case 9: Group Bogies by Type

* Description:
* This class groups similar bogies together using
* Java Stream Collectors.groupingBy().

* At this stage, the application:
* - Creates a List of bogies
* - Streams the List
* - Groups bogies by name
* - Stores grouped data in a Map
* - Displays grouped structure

* This maps classification logic using groupingBy.

* @author Neha D
* @version 9.0
*/

import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Step 1: Create a list of bogies (Passenger + Goods)
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );

        System.out.println("All Bogies:");
        bogies.forEach(System.out::println);

        // Step 2: Group bogies by type using Collectors.groupingBy
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));

        // Step 3: Display grouped bogies
        System.out.println("\nGrouped Bogies:");
        groupedBogies.forEach((type, bogieList) -> {
            System.out.println(type + ":");
            bogieList.forEach(b -> System.out.println("  " + b));
        });
    }
}