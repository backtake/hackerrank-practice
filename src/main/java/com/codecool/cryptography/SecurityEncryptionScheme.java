package com.codecool.cryptography;

import java.util.Scanner;

public class SecurityEncryptionScheme {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int result = 1;
        for(int i=1;i<=n;i++){
            result *= i;
        }
        System.out.println(result);
    }
}
