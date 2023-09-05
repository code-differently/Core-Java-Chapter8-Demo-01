package com.codedifferently.chapter08.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiremanTest {

    private Fireman fireman;

    @BeforeEach
    public void setUp() {
        fireman = new Fireman("John");
    }

    @Test
    public void testDispatch() {
        String result = fireman.dispatch();
        assertEquals("John is dispatched to put out a fire!", result);
    }

    @Test
    public void testStateProfession() {
        String result = fireman.stateProfession();
        assertEquals("John is a Fireman.", result);
    }
}


