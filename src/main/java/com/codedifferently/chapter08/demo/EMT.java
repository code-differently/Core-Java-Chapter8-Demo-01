// Define the package for organizational purposes
package com.codedifferently.chapter08.demo;

// EMT class extending the general emergency personnel concept and implementing the emergency service
public class EMT extends EmergencyPersonnel implements EmergencyService{
    // Constructor to initialize the name of the EMT
    public EMT(String name) {
        super(name);
    }

    // Concrete implementation of the stateProfession method for EMTs
    @Override
    public String stateProfession() {
        return name + " is dispatched to provide medical aid!";
    }

    // Concrete implementation of the dispatch method for EMTs
    @Override
    public String dispatch() {
        return name + " is an EMT.";
    }
}