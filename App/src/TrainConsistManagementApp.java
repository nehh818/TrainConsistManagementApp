/*
MAIN CLASS - formationManagementApp

* Use Case 5: Preserve Insertion Order of Bogies

* Description:
* This class maintains the exact attachment order of bogies
* while also preventing duplicate entries using LinkedHashSet.

* At this stage, the application:
* - Attaches bogies in order
* - Preserves insertion sequence
* - Avoids duplicate bogies
* - Displays final train formation

* This maps ordered uniqueness using LinkedHashSet.

* @author Neha D
* @version 5.0
*/

import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Display welcome banner
        System.out.println(" ==================================== ");
        System.out.println(" === Train Consist Management App === ");
        System.out.println(" =========== Version 5.0 ============ ");
        System.out.println(" ==================================== ");

        // Create
        Set<String> formation = new LinkedHashSet<>();

        //Adding
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper");


        System.out.println("\nFinal Train Formation:\n" +formation);

        System.out.println("\nNote:\nLinkedHashSet preserves insertion order and removes duplicates automatically\n");

        System.out.println("UC5 formation setup completed...\n");







    }
}
