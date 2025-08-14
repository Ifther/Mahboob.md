package mypack3;

import java.util.Scanner;

public class Fpalindrome {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
     String a =String.valueOf(in.nextInt());
     if(Palindrome(a)){
         System.out.println("entered number is a palindrome ");
     }else {
         System.out.println("entered number is  not a palindrome ");
     }
    }
    static boolean Palindrome(String a){
        int len=a.length()-1;
        for (int i = 0; i <a.length()/2 ; i++) {
            if(a.charAt(i)==a.charAt(len)){
                len--;
            }else {
                return false;
            }
        }
        return true;
    }
}
