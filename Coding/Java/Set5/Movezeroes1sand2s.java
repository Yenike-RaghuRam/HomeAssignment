package Set5;

import java.util.Arrays;

public class Movezeroes1sand2s {

    public static void arrange_array(int[] arr){
//        Arrays.sort(arr);
//        int one_pos = 0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == 0){
//                int temp = arr[i];
//                arr[i] = arr[one_pos];
//                arr[one_pos] = temp;
//                one_pos += 1;
//            }
//        }

        // 3 pointers: low, mid, high
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {

                /* Swap nums[low] and nums[mid], then
                move both low and mid pointers forward*/
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                // Move mid pointer forward
                mid++;
            } else {
                /* Swap nums[mid] and nums[high],
                then move high pointer backward*/
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1, 0};
        arrange_array(arr);
        System.out.println(Arrays.toString(arr));
    }
}
