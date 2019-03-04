package com.company;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int hang =3;
        int cot =3;
        int i,p;
        float sum;
        sum = 0;
        float [][]x =  new float[hang][cot];
        Random rand = new Random();
	for(p=0; p <= (cot-1);p = p+1){
	    for(i=0; i<=(hang-1);i=i+1){
	        x[i][p]= rand.nextFloat();
	        System.out.print(x[i][p]);
	        System.out.print(" ");
	    }
	    System.out.println();
	}
	//My idea for solving the problem
	/*for(p=0;p <= (hang-1);p=p+1){
	for(i=0;i <= (cot-1);i=i+1){
		sum = sum + x[i][p];
		p = p+1;*/

	//A better idea
		/*for (i = 0; i <= (cot - 1); i = i + 1) {
			sum = sum + x[i][i];*/

/*x[0][0]+ x[1][1] + x[2][2] + x[3][3] + ... + x[n][n]
khi i = p
phai co gia tri cua i va p bang nhau
dung for loop
 */
// a BETTER way	based on a better idea
for(p=0;p <= (hang-1);p=p+1){
			for(i=0;i <= (cot-1);i=i+1) {
				if(i == p) {
					sum = sum + x[i][p];
				}

			}
		}
System.out.print("Gia tri cua tong la: ");
	System.out.println(sum);
	}
    }


