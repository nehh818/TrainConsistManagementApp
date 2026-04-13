/*
MAIN CLASS - TrainConsistManagementApp

* Use Case 10: Count Total Seats in Train

* Description:
* This class aggregates seating capacity of all bogies
* into a single total using Stream reduce().

* At this stage, the application:
* - Creates bogie List
* - Maps bogies to capacity
* - Reduces values into total
* - Displays total seat count

* This maps aggregation Logic using reduce().

* @author Neha D
* @version 10.0
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

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70)
        );

        System.out.println("Bogies in Train:");
        bogies.forEach(System.out::println);

        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);
    }
}