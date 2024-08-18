package Set4;

import java.util.HashSet;

public class AtleastOneMatchingElement {

    public static boolean onematching(int[] arr1, int[] arr2){
        HashSet<Integer> hs = new HashSet<>();
        for(int val : arr2){
            hs.add(val);
        }
        for(int val : arr1){
            if(hs.contains(val))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,1,4,9,5,2};
        int[] arr2 = {2,1,3,4,10};
        System.out.println(onematching(arr1, arr2));
    }
}
