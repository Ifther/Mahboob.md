package mypack1;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int pe = p.nextInt();
        System.out.println("Your entered is:" + pe);
        if (pe % 2 == 0) {
            System.out.println("entered no:" + pe + " is  EVEN ");
        } else {
            System.out.println("entered no:" + pe + " is ODD");
        }

    }
}
