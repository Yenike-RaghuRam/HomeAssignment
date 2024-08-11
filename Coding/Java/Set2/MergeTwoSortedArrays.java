package Set2;


import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int[] merge_array = new int[arr1.length+arr2.length];
        int start_arr1 = 0;
        int start_arr2 = 0;
        int merge_arr_index = 0;

        while(start_arr1 < arr1.length && start_arr2 < arr2.length){
            if(arr1[start_arr1] < arr2[start_arr2]){
                merge_array[merge_arr_index] = arr1[start_arr1];
                start_arr1++;
            } else {
                merge_array[merge_arr_index] = arr2[start_arr2];
                start_arr2++;
            }
            merge_arr_index++;
        }
        while(start_arr1 < arr1.length){
            merge_array[merge_arr_index] = arr1[start_arr1];
            start_arr1++;
            merge_arr_index++;
        }
        while(start_arr2 < arr2.length){
            merge_array[merge_arr_index] = arr2[start_arr2];
            start_arr2++;
            merge_arr_index++;
        }

        return merge_array;
    }


    public static void main(String[] args) {
        int[] arr1= { 1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergearr = mergeTwoSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergearr));

    }
}
