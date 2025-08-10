package mypack2;

import java.util.Scanner;

public class Electricbill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter power consumption:");
        int a =in.nextInt();
        System.out.print("enter time(hours) :");
        int b=in.nextInt();
        int c =30,i=0;
        int x =a*b*c/1000;
        float rs =0.0f;
        System.out.println("power consumption (in UNITS):"+x);
        while(x>=0){
            x=x-100;
            if(i==0){
                rs=rs+100*3.75f;
                if (x<100){
                    rs=rs+x*3.75f;
                    break;
                }
            }else if(i==1){
                rs=rs+100*5.50f;
                if (x<100){
                    rs=rs+x*5.50f;
                    break;
                }
            }else if(i==2||i==3){
                rs=rs+100*6.50f;
                if (x<100){
                    rs=rs+x*6.50f;
                    break;
                }
            }else if(i>=4&&i<=7){
                rs=rs+100*7.50f;
                if (x<100){
                    rs=rs+x*7.50f;
                    break;
                }
            }else if(i>7){
                rs=rs+100*8.50f;
                if (x<100){
                    rs=rs+x*8.50f;
                    break;
                }
            }
            i++;
        }
        System.out.println("electric bill for one month is:"+rs);

    }
}
