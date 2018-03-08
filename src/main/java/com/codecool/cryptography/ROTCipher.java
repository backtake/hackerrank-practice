package com.codecool.cryptography;

import java.util.Scanner;

public class ROTCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        int key = in.nextInt();
        in.close();
        int value;

        StringBuilder result = new StringBuilder();

        for(int i=0;i<number.length();i++) {
            value = Integer.valueOf(String.valueOf(number.charAt(i))) + key;
            result.append(value<10 ? String.valueOf(value):String.valueOf(value-10));
        }

        System.out.println(result.toString());
    }
}
