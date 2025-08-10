package mypack2;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter numbers and press 0 to end");
        int a =0;
        while (true){
            int x =in.nextInt();
            if(x==1){
                break;
            }
            a+=x;

        }
        System.out.println("addition of all inputs is:"+a);
    }
}
