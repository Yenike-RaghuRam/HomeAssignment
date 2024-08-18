package Set5;

import java.util.ArrayList;

public class LeadersInArray {
    public static ArrayList<Integer> leadersInArray(int[] arr){
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(arr[arr.length - 1]);
        int curr_leader = arr[arr.length - 1];
        for(int i = arr.length - 2; i>=0 ;i--){
            if(arr[i] > curr_leader){
                curr_leader = arr[i];
                leaders.addFirst(curr_leader);
            }
        }
        return leaders;
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        System.out.println(leadersInArray(arr));
    }
}
