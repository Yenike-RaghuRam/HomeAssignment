package Set2;

import java.util.HashMap;
import java.util.Map;

public class PairEqualElementsCount {
    public static int pairequalcount(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i< arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        int count = 0;
        for(Map.Entry val: hm.entrySet()){
            count+= (int)val.getValue()/2;
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 3, 5, 2, 2, 1};
        System.out.println(pairequalcount(arr));
    }
}
