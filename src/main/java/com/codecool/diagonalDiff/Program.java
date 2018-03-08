package com.codecool.diagonalDiff;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        int[][] a = new int[][]{
                { 0, 1, 2, 3},
                { 4, 5, 0, 7},
                { 8, 9, 10, 11},
                { 12, 13, 14, 15},
        };
        System.out.println(a.length);
        int result = diagonalDifference(a);
        System.out.println(result);
    }

    private static int diagonalDifference(int[][] a) {
        int sumA = 0;
        int sumB = 0;
        int singleInteger = a.length;
        int result;
        for(int i=0; i<singleInteger; i++) {
            sumA += a[i][i];
            sumB += a[i][singleInteger - 1 - i];
        }
        if (sumA > sumB) {
            result = sumA - sumB;
        } else {
            result = sumB-sumA;
        }
        return result;
    }
}
