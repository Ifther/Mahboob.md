package mypack2;

import java.net.SocketOption;
import java.util.Scanner;

public class NprNcr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n value :");
        int n = in.nextInt();
        System.out.print("enter r value:");
        int r = in.nextInt();
        if(n<r){
            System.out.println("n must be greater than r!!!");
        }else {
            int a = 1, b = 1, c = 1, h = n - r;
            while (n > 0 && r > 0) {
                a *= n;
                b *= r;
                n--;
                r--;
            }
            while (h > 0) {
                c *= h;
                h--;
            }
            System.out.println("Npr=" + a / c);
            System.out.println("Ncr=" + a / (c * b));
        }
    }

}

