package Set5;

import java.util.ArrayList;

public class LuckyNumber {
    public static boolean isLuckyNumber(int num_pos, int counter){
        if(counter > num_pos)
            return true;
        if(num_pos % counter == 0)
            return false;
        num_pos = num_pos - (num_pos/counter);
        return isLuckyNumber(num_pos, counter + 1);
    }
    public static void main(String[] args) {
        System.out.println(isLuckyNumber(15 ,2));
    }
}
