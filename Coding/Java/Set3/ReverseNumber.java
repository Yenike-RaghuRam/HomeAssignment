package Set3;

public class ReverseNumber {
    public static int reverse_number(int num){
        int new_num = 0;
        while(num !=0){
            int digit = num % 10;
            new_num = new_num * 10 + digit;
            num /= 10;
        }
        return new_num;
    }
    public static void main(String[] args) {
        System.out.println(reverse_number(123));
    }
}
