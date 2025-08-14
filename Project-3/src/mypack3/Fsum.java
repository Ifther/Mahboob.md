package mypack3;

import java.util.Scanner;

public class Fsum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter any two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("sum of "+a+" and "+b+" is "+Sum(a,b));
    }
    static int Sum(int x ,int y){
        int add = x+y;
        return add;
    }
}
