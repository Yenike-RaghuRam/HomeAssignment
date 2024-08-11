package Set1;

import java.util.ArrayList;
import java.util.HashSet;

public class FindElementsINAButNOTInB {

    public static ArrayList<Integer> elementsINANOtinB(int[] arrA, int[] arrB){
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> elementsINB = new HashSet<>();
        for(int num : arrB){
            elementsINB.add(num);
        }
        for(int num : arrA){
            if(!elementsINB.contains(num)){
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arrA = {1,2,3,4,5};
        int[] arrB = {2,3};
        System.out.println(elementsINANOtinB(arrA, arrB));
    }
}
