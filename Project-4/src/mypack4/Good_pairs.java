package mypack4;

import java.util.Arrays;
import java.util.Scanner;

public class Good_pairs {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("enter the size of array :");
        int size = in.nextInt();
        int[] nums =new int[size];
        System.out.print("enter the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i]= in.nextInt();
        }
        System.out.println("entered array is:"+ Arrays.toString(nums));
        int pairs=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]) pairs++;
            }
        }
        System.out.println("number of good pairs are :"+pairs);
    }
}
/**j=i+1;
   *     if(j== nums.length) break;
 *while (i<j){
  *      if(nums[i]==nums[j]) pairs++;
*j++;
 *       if (j == nums.length) break;
  *      }*/
