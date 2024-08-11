package Set2;

public class MaximumProductPair {
    public static int maxProduct(int[] arr){

        if(arr.length <= 1){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        int max_neg = Integer.MIN_VALUE;
        int second_max_neg = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                second_max = max;
                max = arr[i];
            } else if(arr[i] > second_max && arr[i]!=max){
                second_max = arr[i];
            }

            if(Math.abs(arr[i]) > max_neg){
                second_max_neg = max_neg;
                max_neg = Math.abs(arr[i]);
            } else if(Math.abs(arr[i]) > second_max_neg && Math.abs(arr[i])!=max_neg){
                second_max_neg = Math.abs(arr[i]);
            }

        }

        return Math.max(max*second_max, max_neg*second_max_neg);


    }

    public static void main(String[] args) {
        int[] arr = {-1, -3, -4, 2, 0, -5};
        System.out.println(maxProduct(arr));
    }
}
