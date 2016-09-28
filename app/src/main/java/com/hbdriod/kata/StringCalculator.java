package com.hbdriod.kata;

import java.util.StringTokenizer;

/**
 * Created by Nico on 27/09/2016.
 */

public class StringCalculator {

    public int add (String string) {
        String delimiter = "\n,";
        if (!string.isEmpty()) {
            if (string.equals("1")) {
                return 1;
            } else if (string.startsWith("//")){
                delimiter = String.valueOf(string.charAt(2));
                string = string.substring(4);
            }
        } else {
            return 0;
        }
        StringTokenizer st = new StringTokenizer(string, delimiter);
        int result = 0;
        while (st.hasMoreElements()) {
            result += Integer.parseInt(st.nextElement().toString());
        }
        return result;
    }
}
