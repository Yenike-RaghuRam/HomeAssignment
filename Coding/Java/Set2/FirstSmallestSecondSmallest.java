package Set2;

public class FirstSmallestSecondSmallest {

    public static int[] firstNSecondSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for(int i= 0;i<arr.length;i++){
            if(arr[i] < smallest){
                second_smallest = smallest;
                smallest = arr[i];
            } else if(arr[i] < second_smallest && arr[i] != smallest){
                second_smallest = arr[i];
            }
        }

        return new int[]{smallest, second_smallest};
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,4,2};

        int[] val = firstNSecondSmallest(arr);
        System.out.println("smallest is " + val[0]);
        if(val[1]!= Integer.MAX_VALUE){
            System.out.println("second smallest is " + val[1]);
        } else {
            System.out.println("second smallest doesn't exist");
        }
    }
}
