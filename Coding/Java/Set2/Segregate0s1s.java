package Set2;


import java.util.Arrays;

public class Segregate0s1s {
    public static void seggregrate01(int[] arr){
        int one_index = 0;
        int incremental_index = 0;
        while(incremental_index < arr.length){
            if(arr[incremental_index] == 0){
                int temp = arr[incremental_index];
                arr[incremental_index] = arr[one_index];
                arr[one_index] = temp;
                one_index++;
            }
            incremental_index++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        seggregrate01(arr);
        System.out.println(Arrays.toString(arr));
    }
}
