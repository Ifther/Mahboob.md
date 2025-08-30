package mypack4;

import java.util.ArrayList;
import java.util.List;

public class New {
    public static void main(String[] args) {
        int[][] mat ={{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.print(luckyNumbers(mat));
    }
    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row =0,min =0;
        for(int i =0; i<matrix[0].length;i++) {
            int max = 0,count=0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > max) {
                    max = matrix[j][i];
                    row = j;
                }
            }
            for (int k = 0; k < matrix.length; k++) {
                if (max < matrix[row][k]) count++;
            }
            if(count==matrix[0].length-1) min =max;
        }
        list.add(min);
        return  list;

    }
}

