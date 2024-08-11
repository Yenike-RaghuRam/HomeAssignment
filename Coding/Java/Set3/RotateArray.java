package Set3;


import java.util.Arrays;

public class RotateArray {

    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate_array_right(int[] arr, int number_oftimes){
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, number_oftimes - 1);
        reverseArray(arr, number_oftimes, arr.length - 1);
    }

    public static void rotate_array_left(int[] arr, int number_oftimes){
        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, arr.length - number_oftimes, arr.length - 1);
        reverseArray(arr, 0, number_oftimes - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        if(arr.length <= 1){
            System.out.println(Arrays.toString(arr));
            System.exit(0);
        }
        rotate_array_right(arr, 2);
        System.out.println(Arrays.toString(arr));
        rotate_array_left(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
