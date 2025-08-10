package mypack2;

import java.util.Scanner;

public class subrpro {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter any number:");
        int x=in.nextInt();
        int y =x;
        int b=0,c=1;
        while(x>0) {
            int a =x%10;
            b+=a;
            c*=a;
            x/=10;
        }
        int d=c-b;
        System.out.println("Subtracting the product and sum of an integer:"+d);
    }

}
