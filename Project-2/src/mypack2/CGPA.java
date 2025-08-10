package mypack2;

import java.util.Arrays;
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no subjects u have:");
        int no=in.nextInt();
        float a=0,m=0,c=0;
        int[][] arr =new int[no][2];
        System.out.print("enter subject score and its credits:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            m+=arr[i][0];
        }
        for(int[] b: arr) {
            System.out.println(Arrays.toString(b));
        }
        for (int k = 0; k < arr.length ; k++) {
            if(arr[k][0]<=40){
                arr[k][0]=0;
            }
            arr[k][0]=(arr[k][0]/10)+1;
        }
        for (int j = 0;  j< arr.length;j ++) {
            a += arr[j][0] * arr[j][1];
            c += arr[j][1];
        }
        System.out.println("Total marks out of "+no*100+" are:"+m);
        System.out.println("Total grade points:"+a);
        System.out.println("Percentage:"+((a/c)-0.5)*10+"%");
        System.out.println("CGPA:"+(a/c));

    }
}
