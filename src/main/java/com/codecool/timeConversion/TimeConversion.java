package com.codecool.timeConversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {

        if (s.substring(0,2).equals("12") && s.substring(s.length()-2).equals("AM")){
            return "00" + s.substring(2,s.length()-2);
        } else if (s.substring(s.length()-2).equals("AM") || (s.substring(0,2).equals("12") && s.substring(s.length()-2).equals("PM"))){
            return s.substring(0,s.length()-2);
        } else  {
            int hour = Integer.valueOf(s.substring(0,2)) + 12;
            return String.valueOf(hour) + s.substring(2,s.length()-2);
        }
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
        String result = timeConversion("12:45:54PM");
        System.out.println(result);
    }
}

