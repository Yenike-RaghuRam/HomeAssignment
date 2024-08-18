package Set5;

import java.util.Arrays;

public class ReverseSubArrayofsizek {
    public static void reverseksize(int[] arr, int si, int ei, int k){
        int size = ei - si + 1;
        if(k>=size){
            int l = si;
            int h = ei;
            while(l < h){
                int temp = arr[l];
                arr[l] = arr[h];
                arr[h] = temp;
                l++;
                h--;
            }
            return;
        }
        reverseksize(arr, si, si+k-1, k);
        reverseksize(arr, si+k, ei, k);
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseksize(arr, 0, arr.length - 1, 10);
        System.out.println(Arrays.toString(arr));
    }
}
