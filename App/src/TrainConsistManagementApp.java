/*
MAIN CLASS - TrainConsistManagementApp

* Use Case 6: Map Bogie to Capacity (HashMap)

* Description:
* This class associates each bogie with its seating or
* Load capacity using a key-value mapping structure.
*
* At this stage, the application:
* - Creates a HashMap for bogie-capacity mapping
* - Inserts capacity valves for each bogie
* - Iterates through map entries
* - Displays bogie and capacity incapacityMap

* This maps Lookup-based access using HashMap.
* @author Neha D
* @version 6.0
*/

import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Display welcome banner
        System.out.println(" ==================================== ");
        System.out.println(" === Train Consist Management App === ");
        System.out.println(" =========== Version 6.0 ============ ");
        System.out.println(" ==================================== ");

        // Create
        Map<String, Integer> capacityMap = new HashMap<>();

        //puting
        capacityMap.put("First Class", 24 );
        capacityMap.put("Cargo", 120);
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        System.out.println("Boogie Capacity Details:");

       for(String key: capacityMap.keySet()){
           System.out.println( key + " -> "+ capacityMap.get(key) );
       }

        System.out.println("\nUC6 bogie-capacity mapping completed...\n");








    }
}
