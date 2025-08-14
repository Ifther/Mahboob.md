package mypack3;


import java.util.Scanner;


public class Fbetprime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter any two numbers :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.print("prime numbers between " + a + " and " + b + " are ");
        for (int i = a; i < b; i++) {
            int result=Prime(i);
            if(result!=0) {
                System.out.print(" " + result);
            }
        }
    }
    static int Prime(int x ) {
        int count = 0;
        for (int j = 1; j <= Math.sqrt(x); j++) {
            if (x % j == 0) {
                count++;
            }
        }
        if (count == 1) {
            return x;
        }
        return 0;
    }
}

