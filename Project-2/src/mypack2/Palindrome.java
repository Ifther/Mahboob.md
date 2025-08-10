package mypack2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter a number:");
        int a =in.nextInt();
        int org=a,r=0;
        while(a>0) {
            int x = a % 10;
            r =(r*10)+x;
            a= a / 10;
        }
        if(r==org) {
            System.out.println("given number " + org + " is a palindrome");
        }else {
            System.out.println("given number "+org+" is not a palindrome");
        }
    }
}
