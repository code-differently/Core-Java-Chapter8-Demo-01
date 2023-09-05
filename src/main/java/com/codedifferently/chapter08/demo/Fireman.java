// Define the package for organizational purposes
package com.codedifferently.chapter08.demo;

// Fireman class extending the general emergency personnel concept and implementing the emergency service
public class Fireman extends EmergencyPersonnel implements EmergencyService {
    // Constructor to initialize the name of the fireman
    public Fireman(String name) {
        super(name);
    }

    // Concrete implementation of the dispatch method for firemen
    @Override
    public String dispatch() {
        return name + " is dispatched to put out a fire!";
    }

    // Concrete implementation of the stateProfession method for firemen
    @Override
    public String stateProfession() {
        return name + " is a Fireman.";
    }
}
