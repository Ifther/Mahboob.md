package mypack3;

import java.util.Scanner;

public class Fevneodd {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter any number:");
        int a =in.nextInt();
        if(Evenodd(a)){
        System.out.println("ENTERED NUMBER IS EVEN");
        }else {
            System.out.println("ENTERED NUMBER IS ODD");
        }
    }
    static boolean Evenodd(int a){
        if(a%2==0){
            return true;
        }
     return false;
    }

}
