package mypack4;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter the size of array:");
        int s=in.nextInt();
        int[] arr1=new int[s];
        int[] arr2=new int[2*arr1.length];
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]=in.nextInt();
        }
        System.out.print("entered array is:");
        System.out.println(Arrays.toString(arr1));
        int i=0,j=0,a=0;
        /**  for (int i = 0;i<arr2.length;i++){
         *  arr2=arr[i%arr1.length];}
         *  by this we can remove all those variables
         *  if arr1.length = 5;
         * ex:0%5=0;1%5=1...4%5=4,5%5=0;6%5=1
         * so with this logic we can create compact code and not need to use so many variables.*/
        while (i< arr1.length) {
            arr2[j] = arr1[i];
            i++;
            j++;
            if (i == arr1.length) {
                i = 0;
                a++;
            }
            if(a==2) break;
        }
        System.out.print("concatenated array:");
        System.out.println(Arrays.toString(arr2));
    }
}
