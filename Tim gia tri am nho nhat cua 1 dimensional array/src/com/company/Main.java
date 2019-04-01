package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	int i;
	double max_am;
        int N = 4;
        double x[] = new double[N];
        double y[] = new double[N];
        Random rand = new Random();
    for(i = 0; i <= N - 1;i = i + 1) {
        x[i] = 10 * (rand.nextDouble() - 0.5);
        System.out.print(x[i] + " ");
    }
    System.out.println();
    max_am = 0;
    for(i = 0; i<=N-1; i = i + 1){
        if(x[i] < 0){
            max_am = x[i];
        }
    }
    System.out.println("Value of negative x is: " + max_am);
    //Vi ta ko bt tai i = bao nhieu thi y[i] co gia tri am
        //=> Nhap mot gia tri max nho nhat co the de y dau tien chac chan se lon hon
        //=> Ta cap nhat dc gia tri max cua day so y
        //However, se fail neu nhu day so ko co so am nao
        //max_am = x[0];
        //Pros
        // x[i] is a random one dimensional array => at a random i, x will have a random value of either positive or negative number.
        //Because i is completely random, we cannot determine at which i will x have a negative number
        //Therefore, we should specify the value of max_am as an obvious and smallest value in the array range
        //The array has the range from -1 to 1, -1 is the smallest value possible in the array, so we should specify max_am as -1.
        //Cons:
        //Will be harder to be made possible if we do not know the range of the array
        //Will cause confusion to the reader if the array has no negative number (the max_am that will be printed out would be -1)
        //Extra tips: find the smallest double possible in java?
        //Find the loop break in java
        /*
        Alternative ideas
        - If the array range was not given, what to do ?
        We do not know at which i will x has a negative number
        if indicate max_am = x[0]
        2 possibilities
        1st: if x[0] < 0, it would be fine and the code kept on running
        2nd: if x[0] > 0, it would be
        x[0] => Wrong!
        Skip the value of x[0]
        Move to a new value of x[1]
        if x[1] is greater than 0, proceed moving on until we meet a x[i] that has a negative value
        Until we have an x[i] that has a negative value, max_am = x[i]
        Modify the case to correct it
        * Codes to use:
        - For loop
        - If else statement
        Homework: Try to combine the loops

      */
        for(i = 0; i <= N - 1; i = i + 1){
            if(x[i] < 0) {
            y[i] = x[i];
            if (y[i] > max_am) {
                max_am = y[i];
            }
        }
        }
        System.out.println("Max am la: " + max_am);
    }
    }


