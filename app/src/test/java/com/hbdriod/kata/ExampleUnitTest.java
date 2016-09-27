package com.hbdriod.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {


    @Test
    public void addIsEmpty() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    public void addIsOne() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }

    @Test
    public void addSum() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void addSumManyNumbers() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1,2,3"));
    }
}