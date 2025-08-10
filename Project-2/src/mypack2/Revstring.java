package mypack2;

import java.util.Scanner;

public class Revstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        System.out.println("entered  string is="+s);
        int a =s.length();
        System.out.print("reversed string is=");
        for (int i = a-1; i >=0 ; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
