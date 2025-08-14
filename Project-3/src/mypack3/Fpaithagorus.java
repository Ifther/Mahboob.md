package mypack3;

import java.util.Scanner;

public class Fpaithagorus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter any three numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (ispythagorean(a, b, c)) {
            System.out.println("given numbers are pythagorean triplets ");
        } else {
            System.out.println("given numbers are not pythagorean triplets ");
        }
    }
    static boolean ispythagorean(int a,int b ,int c){
        if(a<c||b<c) return false;
        return a * a + b * b == c * c;
    }

}
