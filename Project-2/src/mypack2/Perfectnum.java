package mypack2;

import java.util.Scanner;

public class Perfectnum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter any number:");
        int num=in.nextInt();
        int a=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                a+=i;
            }
        }
        if(a==num){
            System.out.println("entered number is "+num+" a PERFECT NUMBER");
        }else {
            System.out.println("entered number is "+num+" not a PERFECT NUMBER");
        }
    }
}
