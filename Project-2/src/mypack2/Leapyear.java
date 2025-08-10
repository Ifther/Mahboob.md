package mypack2;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter a year:");
        int num=in.nextInt();
        if(num%4==0 && num%100 !=0 || num%400==0 ){
            System.out.println("entered year "+num+" is a LEAP YEAR");
        }else {
            System.out.println("entered year "+num+" is not a LEAP YEAR");
        }
    }
}
