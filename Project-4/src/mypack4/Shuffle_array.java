package mypack4;

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int arraySize = in.nextInt();
        int[] inputArray = new int[arraySize];
        int[] shuffleArray = new int[inputArray.length];
        System.out.print("enter the array:");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i]=in.nextInt();
        }
        System.out.println("entered array is :"+Arrays.toString(inputArray));
        System.out.print("enter the index of array to shuffle:");
        int n = in.nextInt();
        if (inputArray.length % 2 != 0||n !=inputArray.length/2) {
            System.out.println("array size should be a even number");
            return;
        }
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 == 0) {
                shuffleArray[i] = inputArray[j];
                j++;
            }
            if (i % 2 != 0) {
                shuffleArray[i] = inputArray[n];
                n++;
            }
        }
        System.out.println("Shuffled array is:"+Arrays.toString(shuffleArray));
    }
}