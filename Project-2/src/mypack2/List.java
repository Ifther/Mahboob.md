package mypack2;

import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter numbers and press '0'to end:");
        int pos=0,neg=0,odd=0;
        while (true){
            int a =in.nextInt();
            if(a>0){
                pos+=a;
            }else if (a<0){
                neg+=a;
            }
            if (a%2 != 0) {
                odd+=a;
            }
            if(a==0){
                break;
            }
        }
        System.out.println("sum of entered positive  numbers is:"+pos);
        System.out.println("sum of entered negative  numbers is:"+neg);
        System.out.println("sum of entered odd  numbers is:"+odd);
    }
}
