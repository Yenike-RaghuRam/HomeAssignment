package Set1;

public class FirstnLastOccurenceInarray {

    public static int firstOccurence(int[] arr, int target){
        if(arr.length < 1)
            return -1;
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] < target){
                low = mid + 1;
            } else if(arr[mid] > target){
                high = mid - 1;
            } else {
                result = mid;
                high = mid - 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int target){
        if(arr.length < 1)
            return -1;
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] < target){
                low = mid + 1;
            } else if(arr[mid] > target){
                high = mid - 1;
            } else {
                result = mid;
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        System.out.println(firstOccurence(arr, 5));
        System.out.println(lastOccurrence(arr, 5));

    }
}
