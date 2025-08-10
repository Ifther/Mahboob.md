package mypack2;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter any number a=");
        int a =in.nextInt();
        System.out.print("enter any number b=");
        int b =in.nextInt();
        int i=1,max=0,x=0,y=0;
        while(i<=a||i<=b){
            if(a%i==0){
              x=i;
            }
            if(b%i==0){
                y=i;
            }
            if(x==y){
                max=x;
            }
            i++;
        }
        System.out.println("HCF of "+a+" and "+b+" is:"+max);
    }
}
