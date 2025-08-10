package mypack2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter any number:");
        int x=in.nextInt();
        int a=1;
        for(int i =1;i<=x;i++) {
            a*=i;
        }
        System.out.print("factorial of "+x+" is "+a);
    }
}
