/*
MAIN CLASS - TrainConsistManagementApp

* Use Case 4: Maintain Ordered Bogie Consist

* Description:
* This class models the physical chaining of train trainConsist
* using LinkedList for ordered operations.
* At this stage, the application:
* - Adds trainConsist in sequence
* - Inserts trainConsist at specific positions
* - Removes trainConsist from front and rear
* - Displays updated train structure

* This maps positional operations using LinkedList.

* @author Neha D
* @version 3.0
*/

import java.util.LinkedList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Display welcome banner
        System.out.println(" ==================================== ");
        System.out.println(" === Train Consist Management App === ");
        System.out.println(" =========== Version 4.0 ============ ");
        System.out.println(" ==================================== ");

        // Create
        List<String> trainConsist = new LinkedList<>();

        //Adding
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("\nInitial Train Consist:\n" +trainConsist);

        trainConsist.add(2, "Guard");
        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:\n" +trainConsist);

        trainConsist.remove(0);
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("\nAfter removing first and last bogie:\n" +trainConsist);







    }
}
