package mypack1;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("enter n=");
        int count = n.nextInt();
        int i = 0;
        int j = 1;
        System.out.print(i + " ");
        System.out.print(j + " ");
        while (count > 0) {
            int x = j;
            j = i + j;
            i = x;
            System.out.print(j + " ");
            count--;

        }
    }
}
