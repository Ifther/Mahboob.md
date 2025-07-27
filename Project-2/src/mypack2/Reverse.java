package mypack2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter any number:");
        int a = s.nextInt();
        int b = a;
        int rev=0;
        while (a>0){
            int y=a%10;
            rev = (rev*10)+y;
            a =a/10;
        }
        System.out.print("the reverse number of "+b+" is "+rev);
    }
}
