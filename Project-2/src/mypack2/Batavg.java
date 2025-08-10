package mypack2;

import java.util.Scanner;

public class Batavg {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter the total runs scoured:");
        int a= in.nextInt();
        System.out.print("enter no. times out:");
        int b = in.nextInt();
        System.out.println("BATTING AVERAGE:"+(a/b));

    }
}
