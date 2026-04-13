/*
MAIN CLASS - TrainConsistManagementApp

* Use Case 8: Filter Passenger Bogies Using Streams

* Description:
* This class filters passenger bogies based on seating
* capacity using Java Stream API.

* At this stage, the application:
* - Creates a List of bogies
* - Converts List into stremm
* - Applies filter condition
* - Collects filtered result
* - Displays qualifying bogies

* This maps functional filtering using Streams.
* @author Neha D
* @version 8.0
*/

import java.util.*;
import java.util.stream.Collectors;

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Create a list of passenger bogies
        List<PassengerBogie> bogies = Arrays.asList(
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("First Class", 24),
                new PassengerBogie("General", 90)
        );

        System.out.println("Original Bogies:");
        bogies.forEach(System.out::println);

        // Filter bogies with capacity > 60 using Stream API
        List<PassengerBogie> filtered = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(System.out::println);
    }
}