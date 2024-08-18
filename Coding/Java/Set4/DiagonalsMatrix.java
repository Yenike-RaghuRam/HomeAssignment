package Set4;

import java.util.ArrayList;
import java.util.List;

public class DiagonalsMatrix {
    public static List<Integer> diagonalPrint(int[][] arr){
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(arr[i][i]);
        }
        return al;
    }
    public static void main(String[] args) {
        int[] arrnums = {1, 2, 3, 4, 4, 3, 2, 1, 7, 8, 9, 6, 6, 5, 4, 3};
        int arr_index = 0;
        int[][] arr = new int[4][4];
        for(int row = 0;row<arr.length;row++){
            for(int column=0; column<arr[row].length ; column++){
                arr[row][column] = arrnums[arr_index];
                arr_index++;
            }
        }
        System.out.println(diagonalPrint(arr));
    }
}
