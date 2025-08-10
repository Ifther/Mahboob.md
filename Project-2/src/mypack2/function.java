package mypack2;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        sum();
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number 1:");
        int num=in.nextInt();
        System.out.print("enter number 2:");
        int num2=in.nextInt();
        System.out.println("sum ="+(num+num2));
    }
}
