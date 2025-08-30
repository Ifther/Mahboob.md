package mypack4;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int size = in.nextInt();
        int[] nums = new int[size];
        int[] index = new int[size];
        System.out.print("enter the input array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print("entered array is :" + Arrays.toString(nums));
        System.out.print("\nenter the index array :");
        for (int i = 0; i < index.length; i++) {
            index[i] = in.nextInt();
        }
        System.out.println("entered index array :"+Arrays.toString(index));
        array(nums, index);
    }

    static void array(int[] x, int[] y) {
        int temp = 0;
        int[] targetArray = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            if (targetArray[y[i]] != 0) {
                temp = targetArray[y[i]];
                targetArray[i] = temp;
                targetArray[i-1]=x[i];
            } else targetArray[y[i]] = x[i];
        }
        System.out.println(Arrays.toString(targetArray));
    }
}
