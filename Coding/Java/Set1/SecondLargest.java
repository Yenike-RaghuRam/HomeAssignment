package Set1;

public class SecondLargest {
    public static int second_largest(int[] arr){
        int highest = Integer.MIN_VALUE;
        int second_highest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > highest){
                second_highest = highest;
                highest = num;
            } else if(num > second_highest && num != highest){
                second_highest = num;
            }
        }
        return  second_highest;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,4};
        if(arr.length<=1){
            System.exit(0);
        }
        int result = second_largest(arr);
        if(result == Integer.MIN_VALUE){
            System.out.println("There is no second highest");
        } else {
            System.out.println(result);
        }
    }
}
