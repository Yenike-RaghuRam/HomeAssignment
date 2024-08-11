package Set3;


import java.util.ArrayList;

public class SplitNumberToDigits {
    public static ArrayList<Integer> splitNumber(int num){
        ArrayList<Integer> digits  = new ArrayList<>();
        while(num != 0) {
            int digit = num % 10;
            digits.addFirst(digit);
            num /= 10;
        }
        return digits;
    }
    public static void main(String[] args) {
        System.out.println(splitNumber(100));
    }
}
