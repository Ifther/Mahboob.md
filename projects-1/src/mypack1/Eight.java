package mypack1;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a string:");
        int i = 5;
        char d = 0;
        while (i > 0) {
            int j = 0;
            d = s.next().charAt(j);
            j++;
            i--;
        }
        System.out.print(d);
    }
}
