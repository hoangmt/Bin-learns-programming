package com.company;
/*Exercise:
1/ for each, the input comes from standard input and consists of N real numbers between 0.0 and 1.0.
2/ Print the maximum element.
 */
import sun.nio.cs.ext.MS950_HKSCS_XP;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        float x[] = new float[N];
        int i;
        Random random = new Random();
        float Max_value;
        for (i = 0; i <= (N - 1); i++) {
            random.nextFloat();
            x[i] = random.nextFloat();
            System.out.print(x[i] + " ");
        }
        System.out.println();
        Max_value = x[0];
        for (i = 0; i <= N - 1; i = i + 1) {
            if (x[i] > Max_value) {
                Max_value = x[i];
            }
        }
        System.out.println("Gia tri lon nhat la: " + Max_value);
    }
}
//Tips de lam bai
//Giai bai toan as simple as possible
//And then simplifies it as much as you can, make sure it covers all the cases
//Code the answer