package com.codecool.securityHackerrankTasks;

import java.util.Scanner;

public class SecurityFunctionsII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(function(x));
        in.close();
    }

    private static int function(int x) {
        return x*x;
    }
}
