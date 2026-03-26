/*
MAIN CLASS - UseCase1TrainConsistMgmnt

* Use Case 1: Initialize Train and Display Consist Summary

* Description:
* This class represents the entry point of the Train Consist
* Management Application.
* At this stage, the application:
* - Creates an empty train consist
* - Uses a dynamic List to store bogies
* - Displays initial bogie count
* - Prints the current state of the train

* This use case introduces collection initialization and
* basic program startup flow.

* @author Neha D
* @version 1.0
*/

import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Display welcome banner
        System.out.println(" ==================================== ");
        System.out.println(" === Train Consist Management App === ");
        System.out.println(" =========== Version 1.0 ============ ");
        System.out.println(" ==================================== ");

        // Create a dynamic List to store train bogies
        List<String> trainConsist = new ArrayList<>();
        int s = trainConsist.size();

        // Display initial consist information
        System.out.println("Train initialized successfully ... ");
        System.out.println("Train Consist count: " +s);
        System.out.println("Train Consist details: " +trainConsist);
    }
}
