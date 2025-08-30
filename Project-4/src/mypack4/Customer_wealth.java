package mypack4;


import java.util.Arrays;
import java.util.Scanner;

public class Customer_wealth {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter the no of customers:");
        int size = in.nextInt();
        long[][] arr =new long[size][];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter the no.accounts of customer " + (i + 1) + " has:");
            arr[i] = new long[in.nextInt()];
            System.out.print("enter the amount in customer "+(i+1)+"'s accounts:");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
            for (long[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
            long max=0,cu=0;
            for (int k = 0; k < arr.length; k++) {
                long b=0;
                for (int j = 0; j < arr[k].length; j++) {
                    b += arr[k][j] ;
                }
                System.out.println("customer " + (k + 1) + "'s wealth :" + b);
                if (b>max) {
                    max = b;
                    cu=k;
                }
            }
                System.out.println("The customer "+(cu+1)+" is the richest and his wealth is:"+max);
            }
}
