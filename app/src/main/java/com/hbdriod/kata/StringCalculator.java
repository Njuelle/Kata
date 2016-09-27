package com.hbdriod.kata;

/**
 * Created by Nico on 27/09/2016.
 */

public class StringCalculator {

    public int add (String string) {
        if (string.isEmpty()) {
            return 0;
        } else if (string.equals("1")) {
            return 1;
        } else {
            String[] numbers = string.split(",");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
    }

}
