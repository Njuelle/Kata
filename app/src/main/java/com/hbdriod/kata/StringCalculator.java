package com.hbdriod.kata;

import android.util.Log;

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
            int result = 0;
            for (int counter = 0; counter <= numbers.length - 1; counter++){
                result += Integer.parseInt(numbers[counter]);
            }
            return result;
        }
    }

}
