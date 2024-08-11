package Set1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class PairsSumArray {

    public static ArrayList<int[]> pairSum(int[] arr, int sum){

        ArrayList<int[]> result = new ArrayList<>();
        HashSet<Integer> exist_num = new HashSet<>();
        for(int num : arr){
            int remain_sum = sum - num;
            if(exist_num.contains(remain_sum)){
                result.add(new int[]{num, remain_sum});
            }
            exist_num.add(num);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,4,2,6};
//        System.out.println(pairSum(arr, 8));
        ArrayList<int[]> ps = pairSum(arr, 8);
        for(int[] arr1 : ps){
            System.out.println(Arrays.toString(arr1));
        }
    }
}
