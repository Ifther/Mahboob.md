package mypack2;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("enter any large number:");
        Long d =s.nextLong();
        long r = d;
        System.out.print("enter number to find out:");
        int i = s.nextInt();
        int count = 0;
        while (d>0){
            long x = d % 10;
            if(x==i){
                count++;
            }
            d=d/10;

        }
    System.out.print("the number of "+i+" in "+r+" are "+count);
    }
}
