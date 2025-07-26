package mypack1;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("enter indian rupees:");
        int rs = u.nextInt();
        float usd = (float) (rs * 0.012);
        System.out.print("Yours indian rupees in USD are:" + usd);
    }
}
