package mypack3;

import java.util.Scanner;

public class Ffirstn {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter any number :");
        System.out.println("sum of first given number is :"+isSum(in.nextInt()));
    }
    static int isSum(int a){
        int result=0;
        for (int i = a; i >0 ; i--) {
            result+=i;
        }
        return result;
    }
}
