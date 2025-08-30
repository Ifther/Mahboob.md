package mypack4;

import java.util.Arrays;
import java.util.Scanner;

public class Addarray {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter the size of array:");
        int s =in.nextInt();
        int[] arr1=new int[s];
        int[] arr2=new int[s];
        for (int i = 0; i <s; i++) {
            arr1[i]=in.nextInt();
            for (int j = 0; j <= i; j++) {
                arr2[i]+=arr1[j];
            }
        }
        System.out.print("entered array is:");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Sum of 1D array is:");
        System.out.println(Arrays.toString(arr2));
        in.close();
    }
}
