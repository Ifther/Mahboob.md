package mypack4;

import java.util.Arrays;
import java.util.Scanner;

public class Smaller_current {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter the size of array :");
        int size = in.nextInt();
        int[]  inputArray = new int[size];
        int[] smallerArray =new int[size];
        System.out.print("enter the array:bv ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i]= in.nextInt();
        }
        System.out.println("entered array is:"+ Arrays.toString(inputArray));
        for (int i = 0; i < inputArray.length; i++) {
            int count =0;
            for (int j = 0; j < smallerArray.length; j++) {
                if(j==i) j++;                                //need use continue keyword instead of incrementing
                if(j==smallerArray.length) break;                 // or in if(i!=j&&inputarray[i]>smallerarray[j]) use this condition
                if(inputArray[i]>inputArray[j]) count++;            //incrementing inside a loop is risky may cause out of bound situations
            }                                                                             // if we won't handle correctly
            smallerArray[i]=count;
        }
        System.out.println("smaller no's then a number in array are:"+Arrays.toString(smallerArray));
    }
}
