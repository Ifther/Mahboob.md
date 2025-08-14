package mypack3;

import java.util.Scanner;

public class Farea {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter the radius of the circle:");
        int r = in.nextInt();
        System.out.println("circumference of a circle with radius "+r+" is:"+circum(r));
        System.out.println("area of a circle with radius "+r+" is:"+area(r));
    }
    static float circum(int x){
        return (float)(2*Math.PI*x);
    }
    static float area(int x){
        return (float)Math.PI*x*x;
    }
}
