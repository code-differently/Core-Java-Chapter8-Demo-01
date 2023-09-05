package com.codedifferently.chapter08.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolicemanTest {

    private Policeman policeman;

    @BeforeEach
    public void setUp() {
        policeman = new Policeman("Alex");
    }

    @Test
    public void testDispatch() {
        String result = policeman.dispatch();
        assertEquals("Alex is dispatched to investigate a crime scene!", result);
    }

    @Test
    public void testStateProfession() {
        String result = policeman.stateProfession();
        assertEquals("Alex is a Policeman.", result);
    }
}



