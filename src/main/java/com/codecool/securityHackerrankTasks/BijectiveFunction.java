package com.codecool.securityHackerrankTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BijectiveFunction {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> values = generateRandomArrayOfValues(n);
//        List<Integer> values = new ArrayList<>(2);
//        values.add(11);
//        values.add(12);
        System.out.println(isFunctionBijective(n, values));
        in.close();
    }

    private static String isFunctionBijective(int n, List<Integer> values){
        if (isBijective(n, values)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    private static boolean isBijective(int n, List<Integer> values) {
        ArrayList<Integer> unique = new ArrayList<>(n);
        for (int numb: values){
            if (unique.contains(numb)){
                return false;
            }
            unique.add(numb);
        }
        return true;
    }

    private static List<Integer> generateRandomArrayOfValues(int n){
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(100));
        }
        for (int ele: list){
            System.out.println(ele);
        }
        return list;
    }

//    private static List<Integer> generateListOfArguments(int n) {
//        List<Integer> arguments = new ArrayList<>(n);
//        for(int i=1;i<=n;i++){
//            arguments.add(i);
//        }
//
//        return arguments;
//    }

}
