package com.codedifferently.chapter08.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EMTTest {

    private EMT emt;

    @BeforeEach
    public void setUp() {
        emt = new EMT("Sarah");
    }

    @Test
    public void testStateProfession() {
        String result = emt.stateProfession();
        assertEquals("Sarah is dispatched to provide medical aid!", result);
    }

    @Test
    public void testDispatch() {
        String result = emt.dispatch();
        assertEquals("Sarah is an EMT.", result);
    }
}
