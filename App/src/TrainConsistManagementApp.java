/*
MAIN CLASS - TrainConsistManagementApp

* Use Case 2: Add Passenger Bogies to Train

* Description:
* This class demonstrates how passenger bogies can be managed dynamically using ArrayList operations.
* At this stage, the application:
* - Adds new bogies to the train
* - Removes existing bogies
* - Checks for bogie availability
* - Displays the final consist

* This maps CRUD operations using ArrayList.

* @author Neha D
* @version 2.0
*/

import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Display welcome banner
        System.out.println(" ==================================== ");
        System.out.println(" === Train Consist Management App === ");
        System.out.println(" =========== Version 2.0 ============ ");
        System.out.println(" ==================================== ");

        // Create a dynamic List to store train bogies
        List<String> passengerBogies = new ArrayList<>();

        //Adding
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("After adding Boogies: ");
        System.out.println("Passenger bogies: "+passengerBogies );

        //Removing
        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter removing 'AC Chair': ");
        System.out.println("Passenger bogies: "+passengerBogies );

        //Checking
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        //Display
        System.out.println("\nFinal Train Passenger Consists:\n" +passengerBogies);


    }
}
