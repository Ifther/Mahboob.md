package mypack2;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max =0;
        while(true) {
          int a =in.nextInt();

          if(a>=max){
              max=a;
          }
            if(a==0){
                break;
            }
        }
        System.out.print("the largest number is:"+max);
    }
}
