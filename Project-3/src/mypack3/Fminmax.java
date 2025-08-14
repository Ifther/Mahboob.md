package mypack3;

import java.util.Scanner;

public class Fminmax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter any three numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int Min = minimum(a, b, c);
        int Max = maximum(a, b, c);
        System.out.println("Maximum =" + Max);
        System.out.println("Minimum =" + Min);
    }
        static int maximum ( int a, int b, int c){
            int max = a;
            if (b > a && b > c) {
                max = b;
            } else if (c > a) {
                max = c;
            }
            return max;
        }
        static int minimum ( int a, int b, int c){
            int min = a;
            if (b < a && b < c) {
                min = b;
            } else if (c < a) {
                min = c;
            }
            return min;
        }
}
