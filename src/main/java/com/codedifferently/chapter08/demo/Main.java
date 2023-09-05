// Define the package for organizational purposes
package com.codedifferently.chapter08.demo;

// Import ArrayList to store multiple emergency services
import java.util.ArrayList;

// Main class to run the demonstration
public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to hold emergency service instances
        ArrayList<EmergencyService> emergencyServices = new ArrayList<>();

        // Instantiate a fireman named John
        Fireman fireman = new Fireman("John");
        // Instantiate a policeman named Alex
        Policeman policeman = new Policeman("Alex");
        // Instantiate an EMT named Sarah
        EMT emt = new EMT("Sarah");

        // Add the instantiated services to the list
        emergencyServices.add(fireman);
        emergencyServices.add(policeman);
        emergencyServices.add(emt);

        // Loop through each emergency service in the list
        for (EmergencyService emergencyService : emergencyServices) {
            // Dispatch the service and print the result
            String out = emergencyService.dispatch();
            System.out.println(out);

            // State the profession of the service and print the result
            String out2 = ((EmergencyPersonnel) emergencyService).stateProfession();
            System.out.println(out2);
        }
    }
}