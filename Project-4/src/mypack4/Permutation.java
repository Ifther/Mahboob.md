package mypack4;

import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter number of elements :");
        int a = in.nextInt();
        System.out.println("enter an elements of array:");
        int[] arr=new int[a];
        int[] NEW=new int[a];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=in.nextInt();
        }
        for (int J = 0; J < NEW.length; J++) {
            NEW[J]=arr[arr[J]];
        }
        System.out.println("array permutation:");
            System.out.print(Arrays.toString(NEW));

    }
}
