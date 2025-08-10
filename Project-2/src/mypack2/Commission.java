package mypack2;

import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the Total amount:");
        int amo = in.nextInt();
        System.out.print("entre the Commission amount:");
        float dis = in.nextFloat();
        float rs = (dis/amo)*100;
        System.out.println("amount after removing discount:"+rs+"%");


    }
}
