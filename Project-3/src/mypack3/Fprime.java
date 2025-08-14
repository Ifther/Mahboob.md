package mypack3;

import java.util.Scanner;

public class Fprime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter any number:");
        int pri= in.nextInt();
        if(pri==1){
            System.out.println("1 is neither prime nor composite number");
            return;
        }
        if(Prime(pri)){
            System.out.println("given number is "+pri+" a prime number");
        }else {
            System.out.println("given number is "+pri+" a not prime number");
        }
    }
    static boolean Prime(int x){
        int count=0;
        for (int i = 1; i <=x ; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        if (count==2 ){
            return true;
        }
        return false;
    }
}
