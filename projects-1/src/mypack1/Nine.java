package mypack1;

import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("enter any no:");
        int arm = n.nextInt();
        int y = arm;
        int c = 0;
        while (arm > 0) {
            int x = arm % 10;
            arm = arm / 10;
            c = c + (x * x * x);
        }
        if (c == y) {
            System.out.println("The given number " + y + " is Armstrong number");
        } else {
            System.out.println("The given number " + y + "  is not a Armstrong number");
        }
    }
}
