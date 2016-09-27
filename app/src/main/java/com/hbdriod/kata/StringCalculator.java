package com.hbdriod.kata;

/**
 * Created by Nico on 27/09/2016.
 */

public class StringCalculator {

    public int add (String string) {
        if (!string.isEmpty()) {
            if (string.equals("1")) {
                return 1;
            }
        } else {
            return 0;
        }
        return -1;
    }

}
