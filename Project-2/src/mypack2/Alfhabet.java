package mypack2;

import java.util.Scanner;

public class Alfhabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ac = in.next().charAt(0);
        if (ac >= 'A' && ac <= 'Z') {
            ac = (char) (ac + 32);
        }
        if (ac == 'a' || ac == 'e' || ac == 'i' || ac == 'o' || ac == 'u') {
            System.out.println("entered character '" + ac+ "' is vowel");
        } else {
            System.out.println("entered character '" + ac + "' is consonant");
        }
    }
}
