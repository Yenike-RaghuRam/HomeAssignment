package Set2;

public class ElementsStartDecreasing {

    public static int elem_start_decrease(int[] arr){
        if(arr.length == 0 || arr.length == 1){
            return -1;
        }
        int n = arr.length - 2;
        while(n >= 0){
            if(arr[n] > arr[n+1])
                n--;
            else
                break;
        }
        return arr[n+1];
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 2, 1};
        System.out.println(elem_start_decrease(arr));
    }
}
