package mypack3;

import java.util.Scanner;

public class Ffactorial {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter any number:");
        long fac =in.nextInt();
        System.out.println("Factorial of given number "+fac+"! is :"+Factorial(fac));
    }
    static long Factorial(long c){
        long a=1;
        if(c==0||c==1){
            return 1;
        }
        for (int i = 1; i <=c ; i++) {
            a*=i;
        }
        return a;
    }
}
