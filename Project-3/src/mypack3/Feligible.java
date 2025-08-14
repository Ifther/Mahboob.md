package mypack3;

import java.util.Scanner;

public class Feligible {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter the age of the person:");
        int age = in.nextInt();
        if(Age(age)){
            System.out.println("The person is eligible for vote");
        }else{
            System.out.println("The person is not eligible for vote");
        }
    }
    static boolean Age(int x){
        if(x>=18){
            return  true;
        }
        return false;
    }
}
