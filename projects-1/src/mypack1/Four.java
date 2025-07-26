package mypack1;

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no.a=");
        int a = in.nextInt();
        System.out.print("enter no.b=");
        int b = in.nextInt();
        System.out.print("enter an operation:");
        String c = in.next();
        if (c.equals("+")) {
            int sum = a + b;
            System.out.println("sum=" + sum);
        } else if (c.equals("-")) {
            int sub = a - b;
            System.out.println("sub=" + sub);
        } else if (c.equals("*")) {
            int multi = a * b;
            System.out.println("multiplication=" + multi);
        } else if (c.equals("*")) {
            int multi = a * b;
            System.out.println("multiplication=" + multi);
        } else if (c.equals("/")) {
            float div = (float) a / b;
            System.out.println("division=" + div);
        }
    }
}
