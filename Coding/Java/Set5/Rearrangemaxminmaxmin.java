package Set5;

import java.util.Arrays;

public class Rearrangemaxminmaxmin {

    public static void rearrangemaxmin(int[] arr){
        int min_index = 0;
        int max_index = arr.length - 1;
        int max_elem = arr[arr.length - 1] + 1;
        for(int i=0; i<arr.length;i++){
            if(i % 2 == 0){
                arr[i] += (arr[max_index]%max_elem) * max_elem;
                max_index--;
            } else {
                arr[i] += (arr[min_index]%max_elem) * max_elem;
                min_index++;
            }
        }
        for(int i=0;i <arr.length;i++){
            arr[i] /= max_elem;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rearrangemaxmin(arr);
        System.out.println(Arrays.toString(arr));
    }
}
