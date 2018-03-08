package com.codecool.securityHackerrankTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InverseFunction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> pairs = new HashMap<>(n);
        for (int i = 1; i<=n; i++) {
            pairs.put(in.nextInt(), i);
        }
        in.close();

        for(int i = 1; i<=n; i++){
            System.out.println(pairs.get(i));
        }
    }
}
