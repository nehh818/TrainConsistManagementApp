/*
MAIN CLASS - TrainConsistManagementApp

* Use Case 3: Track Unique Bogie IDs
* Description:
* This class ensures that duplicate bogie IDs are not
* added into the train formation using HashSet.
* At this stage, the application:
* - Stores bogie IDs
* - Prevents duplicates automatically
* - Displays unique bogie identifiers

* This maps uniqueness validation using Set.

* @author Neha D
* @version 3.0
*/

import java.util.HashSet;
import java.util.Set;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Display welcome banner
        System.out.println(" ==================================== ");
        System.out.println(" === Train Consist Management App === ");
        System.out.println(" =========== Version 3.0 ============ ");
        System.out.println(" ==================================== ");

        // Create
        Set<String> Bogies = new HashSet<>();

        //Adding
        Bogies.add("BG101");
        Bogies.add("BG102");
        Bogies.add("BG103");
        Bogies.add("BG104");

        //Duplicate will be ignored automatically
        Bogies.add("BG101");
        Bogies.add("BG102");


        //Display
        System.out.println("\nBogie IDs After Insertion:\n" +Bogies);

        System.out.println("\nNote:\nDuplicates are automatically ignored by Hashset.");




    }
}
