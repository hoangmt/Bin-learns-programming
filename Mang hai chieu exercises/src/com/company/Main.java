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

        int N = 5;
        float x[] = new float[N];
        int i, p;
        Random random = new Random();
        float Max_value;
        for (i = 0; i <= (N - 1); i++) {
            random.nextFloat();
            x[i] = random.nextFloat();
            System.out.print(x[i] + " ");
        }
        System.out.println();
        //x[0] = 2, x[1]=1, x[2] =5, Max la 5
        //
     //for (i = 0; i <= 1; i = i + 1) { //vong loop co the bi xoa
        for (p = 0; p <= N - 1; p = p + 1) {
            Max_value = x[p];
            //Nhap gia tri cua max value vao la x[0]
            //Gia tri max_value da tien len thanh x[1]
            //Muon lam: giu gia tri cua max_value nhu cu la x[0]
            if((x[p] >= Max_value)) {
                x[p] = Max_value;
            }
            System.out.println("Gia tri lon nhat la: " + Max_value);
        }

    }
}
/*
x[0]
 */





        /*int a, b, c;
        int Max_value;
        Scanner input_1 = new Scanner(System.in);
        a = input_1.nextInt();
        System.out.println("Nhap gia tri cua a: " + a);
        b = input_1.nextInt();
        System.out.println("Nhap gia tri cua b: " + b);
        c = input_1.nextInt();
        System.out.println("Nhap gia tri cua c: " + c);
        if (a - b > 0) {
            Max_value = a;
        } else {
            Max_value = b;
        }
        if (c - Max_value > 0) {
            Max_value = c;
        }
        System.out.print("Gia tri lon nhat la: " + Max_value);
    }*/


/*
how to lam 101
for(i=0;i<=14;i=i++){
    for(p=0;p<=13;p=p++){
    x[i] = x[i] - x[i]
}
}
a, b
a - b > 0
=> a lon nhat
a - b < 0
=> b lon nhat


}



1 7 5 4 9 8 10 2 50 3 4 8 9 61

*/
