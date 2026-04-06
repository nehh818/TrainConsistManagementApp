/*
MAIN CLASS - TrainConsistManagementApp

* Use Case 7: Sort Bogies by Capacity (Comparator)

* Description:
* This class sorts passenger bogies based on seating
* capacity using a custom Comparator.

* At this stage, the application:
* - Creates bogie objects
* - Stores them in a List
* - Displays unsorted data
* - Sorts using Comparator Logic
* - Displays sorted result
*
* This maps custom ordering using Comparator.
* @author Neha D
* @version 7.0
*/

import java.util.*;
public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;


        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

    }
    public static void main(String[] args) {
        // Display welcome banner
        System.out.println(" ==================================== ");
        System.out.println(" === Train Consist Management App === ");
        System.out.println(" =========== Version 6.0 ============ ");
        System.out.println(" ==================================== ");



        // Create
        List<Bogie> bogies = new ArrayList<>();

        //adding
        bogies.add(new Bogie("Sleeper", 72 ));
        bogies.add(new Bogie("AC Chair", 56 ));
        bogies.add(new Bogie("First Class", 24 ));
        bogies.add(new Bogie("General", 90 ));

        System.out.println("Before sorting:");
        for(Bogie b: bogies){
           System.out.println( b.name + " -> "+ b.capacity );
       }
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("After sorting:");
        for(Bogie b: bogies){
            System.out.println( b.name + " -> "+ b.capacity );
        }









    }
}
