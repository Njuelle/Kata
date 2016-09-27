package com.hbdriod.kata;

import java.util.StringTokenizer;

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
            StringTokenizer st = new StringTokenizer(string,"\n,");

            int result = 0;
            while (st.hasMoreElements()) {
                result += Integer.parseInt(st.nextElement().toString());
            }
            return result;
        }
    }
}
