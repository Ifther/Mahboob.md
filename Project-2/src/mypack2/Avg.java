package mypack2;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        System.out.print("enter numbers,and press '0' if entry is completed:");
        Scanner in=new Scanner(System.in);
        int i=0,a=0;
        while(true){
            int x=in.nextInt();
            if(x==0){
                break;
            }
            a+=x;
            i++;
        }
        float avg =(float) a/i;
        System.out.print("avg of entered numbers is:"+avg);

    }
}
