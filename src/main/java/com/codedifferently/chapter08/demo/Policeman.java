// Define the package for organizational purposes
package com.codedifferently.chapter08.demo;

// Policeman class extending the general emergency personnel concept and implementing the emergency service
public class Policeman extends EmergencyPersonnel implements EmergencyService {
    // Constructor to initialize the name of the policeman
    public Policeman(String name) {
        super(name);
    }

    // Concrete implementation of the dispatch method for policemen
    @Override
    public String dispatch() {
        return name + " is dispatched to investigate a crime scene!";
    }

    // Concrete implementation of the stateProfession method for policemen
    @Override
    public String stateProfession() {
        return name + " is a Policeman.";
    }
}
