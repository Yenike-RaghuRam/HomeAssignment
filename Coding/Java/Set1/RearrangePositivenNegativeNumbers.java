package Set1;

import java.util.Arrays;

public class RearrangePositivenNegativeNumbers {

    public static int[] preserve_order(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int[] result = new int[arr.length];
        int p_index = 0;
        int n_index = 1;
        for(int num : arr){
            if(num > 0){
                result[p_index] = num;
                p_index += 2;
            } else {
                result[n_index] = num;
                n_index += 2;
            }
        }
        return result;
    }

    public static void without_preserve_order(int[] arr){
        if(arr.length <= 1){
            return;
        }
        int arr_len = arr.length;
        int p_index = 0;
        int n_index = arr.length - 1;
        while(p_index < n_index){
            while(p_index < arr_len){
                if(arr[p_index] < 0){
                    break;
                }
                p_index += 2;
            }
            while(n_index >= 0){
                if(arr[n_index] > 0){
                    break;
                }
                n_index -= 2;
            }
            if(p_index < arr_len && n_index >=0){
                int temp = arr[p_index];
                arr[p_index] = arr[n_index];
                arr[n_index] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,-4,6,-3,-2};
        System.out.println(Arrays.toString(preserve_order(arr)));
        without_preserve_order(arr);
        System.out.println(Arrays.toString(arr));
    }
}
