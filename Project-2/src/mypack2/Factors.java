package mypack2;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        System.out.print("enter any number:");
        Scanner in =new Scanner(System.in);
        int x =in.nextInt();
        System.out.print("factors of "+x+" are:");
        for(int i=1;i<=x;i++){
             if (x%i==0){
                 System.out.print(i+" ");
             }
        }
    }
}
