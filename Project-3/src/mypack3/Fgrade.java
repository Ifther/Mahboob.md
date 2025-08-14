package mypack3;

import java.util.Scanner;

public class Fgrade {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the marks  secured :");
        int marks =in.nextInt();
        if(marks<0 || marks>100){
            System.out.println("marks are incorrectly entered ,error !!");
            return;
        }
        System.out.println("Grade for marks "+marks+" is :"+Grade(marks));
    }
    static String Grade(int c){
        if (c>=91 && c<=100){
            return "AA";
        }else if (c>=81 && c<=90) {
            return "AB";
        }else if (c>=71 && c<=80) {
            return "BB";
        }else if (c>=61 && c<=70) {
            return "BC";
        }else if (c>=51 && c<=60) {
            return "CD";
        }else if (c>=40 && c<=50) {
            return "DD";
        }else {
            return "FAIL";
        }
    }
}
