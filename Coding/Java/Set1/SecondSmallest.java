package Set1;

public class SecondSmallest {

    public static int second_small(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < smallest){
                second_smallest = smallest;
                smallest = num;
            } else if(num < second_smallest && num != smallest){
                second_smallest = num;
            }
        }
        return second_smallest;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,4,2};
        if(arr.length <= 1){
            System.out.println("There is no second smallest");
            System.exit(0);
        }
        int result = second_small(arr);
        if(result == Integer.MAX_VALUE){
            System.out.println("There is no second smallest");
        } else {
            System.out.println(result);
        }
    }
}
