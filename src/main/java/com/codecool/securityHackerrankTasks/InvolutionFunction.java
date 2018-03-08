package com.codecool.securityHackerrankTasks;
import java.util.*;

public class InvolutionFunction {

    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] f = new int[n];
        int[] g = new int[n];
        for(int i=0;i<n;i++) {
            f[i] = in.nextInt();
        }
        in.close();

        for(int i=0;i<n;i++) {
            g[f[i] - 1] = i + 1;
        }

        System.out.print(Arrays.equals(f,g) ?"YES":"NO");
    }
}
