package Set3;

public class SumDigitsNumber {
    public static int sumDigits(int num){
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(100));
    }
}
