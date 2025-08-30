package mypack4;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number:");
        num=sc.nextInt();
        if((num%2)==0) {
            System.out.print(num+"is even");
        }
        else
        {
            System.out.print(num+"is odd");
        }
        
    }
}
