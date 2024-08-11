package Set3;

import java.util.Arrays;

public class SwapTwoarrays {
    public static void swaparrays(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            System.out.println("Arrays cannot be swapped");
            return;
        }
        for(int index = 0;index < arr1.length;index++){
            int temp = arr1[index];
            arr1[index] = arr2[index];
            arr2[index] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        swaparrays(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
