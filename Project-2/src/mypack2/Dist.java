package mypack2;

import java.util.Scanner;

public class Dist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       System.out.print("enter x1:");
       int x1= in.nextInt();
        System.out.print("enter y1:");
        int y1= in.nextInt();
        System.out.print("enter x2:");
        int x2= in.nextInt();
        System.out.print("enter y2:");
        int y2= in.nextInt();
       double dist = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println("distance between two points("+x1+","+y1+") and ("+x2+","+y2+") is:"+dist);
    }
}
