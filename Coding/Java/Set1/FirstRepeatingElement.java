package Set1;

import java.util.HashSet;

public class FirstRepeatingElement {

    public static int firstRepeating(int[] arr){
        HashSet<Integer> val = new HashSet<>();
        for(int num : arr){
            if(val.contains(num)){
                return num;
            }
            val.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 6, 6};
        int result = firstRepeating(arr);
        if(result!=-1)
            System.out.println(result);
        else
            System.out.println("There is no repeating element");
    }
}
