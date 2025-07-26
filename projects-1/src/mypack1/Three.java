package mypack1;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner yt = new Scanner(System.in);
        System.out.print("enter Principle amount:");
        int p = yt.nextInt();
        System.out.print("entr Rate:");
        float r = yt.nextFloat();
        System.out.print("enter time period:");
        int t = yt.nextInt();
        float result = p * r * t / 100;
        System.out.println("SIMPLE INTEREST:" + result);

    }
}
