package mypack4;

import java.util.Arrays;
import java.util.Scanner;

public class Greatest_candies {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter the size :");
        int SIZE = in.nextInt();
        int[] no_candies= new int[SIZE];
        boolean[] result=new boolean[SIZE];
        System.out.print("enter the array:");
        for (int i = 0; i < no_candies.length; i++) {
            no_candies[i]= in.nextInt();
        }
        System.out.println("no of candies individual kid got :"+ Arrays.toString(no_candies));
        System.out.print("Enter the extra candies children get:");
        int Extra_candies= in.nextInt();
        int max=0;
        for (int i = 0; i < no_candies.length; i++) {
            if(max<no_candies[i]) max=no_candies[i];
        }
        for (int i = 0; i < result.length; i++) {
            if(no_candies[i]+Extra_candies>=max) result[i]=true;
        }
        System.out.println("children who got greatest no. of candies are :"+Arrays.toString(result));


    }
}
