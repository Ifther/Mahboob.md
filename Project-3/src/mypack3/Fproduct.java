package mypack3;

import java.util.Scanner;

public class Fproduct {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter any two numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Product of "+a+" and "+b+" is "+Product(a,b));
    }
    static int Product(int x ,int y){
        int pro = x*y;
        return pro;
    }
}
