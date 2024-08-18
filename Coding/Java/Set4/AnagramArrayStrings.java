package Set4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class AnagramArrayStrings {

    public static Collection<ArrayList<String>> anagramlist(String[] words){
        HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
        for(String w : words) {
            int val = 0;
            for (int i = 0; i < w.length(); i++) {
                val += w.charAt(i);
            }
            if (hm.containsKey(val)) {
                ArrayList<String> list_val = hm.get(val);
                list_val.add(w);
                hm.put(val, list_val);
            } else {
                ArrayList<String> list_val = new ArrayList<>();
                list_val.add(w);
                hm.put(val, list_val);
            }

        }
        return hm.values();
    }
    public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(Arrays.toString(words));
        System.out.println(anagramlist(words));
    }
}
