package mypack2;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the amount of the product:");
        int amo = in.nextInt();
        System.out.print("entre the discount percentage:");
        float dis = in.nextFloat()/100;
        float rs = amo-(amo*dis);
        System.out.println("amount after removing discount:"+rs);


    }
}
