package mypack1;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.print("emter a =");
        int a = o.nextInt();
        System.out.print("emter b =");
        int b = o.nextInt();
        if (a > b) {
            System.out.println("no.a=" + a + ",is Greater");
        } else {
            System.out.println("no.b=" + b + ",is Greater");
        }
    }
}
