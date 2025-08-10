package mypack2;

import java.util.Scanner;

public class Futureval {
    public static void main(String[] args) {
        Scanner yt = new Scanner(System.in);
        System.out.print("enter Principle amount:");
        int p = yt.nextInt();
        System.out.print("enter annual interest Rate:");
        float r = yt.nextFloat()/100;
        System.out.print("enter time period in years:");
        int t = yt.nextInt();
        float result = p*(float)Math.pow(1+r,t);
        System.out.println("FUTURE VALUE:"+result);

    }

}
