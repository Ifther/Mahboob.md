package mypack1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("please enter an input:-");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("your  roll.no is " + rollno);
    }
}
