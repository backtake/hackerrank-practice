package com.codecool.cryptography;

import java.util.Scanner;

public class BasicCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        in.close();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0;i<number.length();i++) {
            if (Integer.valueOf(String.valueOf(number.charAt(i)))==9) {
                stringBuilder.append("0");
            } else {
                stringBuilder.append(Integer.valueOf(String.valueOf(number.charAt(i)))+1);
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
