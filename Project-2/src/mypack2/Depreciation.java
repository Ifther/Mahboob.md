package mypack2;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter actual cost of the asset:");
        long a =in.nextLong();
        System.out.print("enter the salvage value of asset::");
        long b =in.nextLong();
        System.out.print("enter useful of the asset:");
        int c =in.nextInt();
        long d= (a-b)/c;
        System.out.println("Depreciation value of the asset:"+d);

    }
}
