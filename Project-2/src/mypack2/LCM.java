package mypack2;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter any number a=");
        int a = in.nextInt();
        System.out.print("enter any number b=");
        int b = in.nextInt();
        int min=0,i=1,y=0;
        while (a>0){
            int x =a*i;
            int j=1;
            while (j<1000) {
                y = b * j;
                if (x == y) {
                    min = x;
                    break;
                } else {
                    j++;
                }
            }
            if(min==x){
                break;
            }
            else {
                i++;
            }

        }
        System.out.println(min);


    }
}