package mypack1;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("enter any no:");
        int arm = n.nextInt();
        int y = arm,e=arm;
        int m=0;
        while (e > 0) {
            int x = e % 10;
            e = e / 10;
            m++;
        }
        int c = 0;
        while (arm > 0) {
            int x = arm % 10;
            arm = arm / 10;
            c = ( c +(int) Math.pow(x,m));
        }
        if (c == y) {
            System.out.println("The given number " + y + " is Armstrong number");
        } else {
            System.out.println("The given number " + y + "  is not a Armstrong number");
        }
    }
}
