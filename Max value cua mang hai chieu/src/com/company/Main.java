package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    int hang,cot;
    double Max_value;
    hang = 10;
    cot = 10 ;
    int i,p;
        float x[][] = new float[hang][cot];
    Random rand = new Random();
    Max_value = x[0][0];
    for(i = 0;i <= hang - 1; i = i + 1){
        for(p = 0;p <= cot - 1; p = p +1){
           x[i][p] = rand.nextFloat();
        if(x[i][p] > Max_value){
            Max_value = x[i][p];
        }
           System.out.print(x[i][p] + " ");
        }
        System.out.println();
    }
    System.out.println("Max value la: " + Max_value);

    }
}
