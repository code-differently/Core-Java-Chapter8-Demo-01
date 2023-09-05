// Define the package for organizational purposes
package com.codedifferently.chapter08.demo;

// Abstract class representing the general concept of an Emergency Personnel
public abstract class EmergencyPersonnel {
    // Protected member variable to store the name of the emergency personnel
    protected String name;

    // Constructor to initialize the name of the emergency personnel
    public EmergencyPersonnel(String name) {
        this.name = name;
    }

    // Abstract method declaration that, when implemented, will state the profession of the personnel
    public abstract String stateProfession();
}