package com.codecool.staircase;

import java.util.Scanner;

public class Staircase {

    static void staircase(int n) {
        for(int i=1;i<=n;i++){
            System.out.println(new String(new char[n-i]).replace("\0", " ") + new String(new char[i]).replace("\0", "#"));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
