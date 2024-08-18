package Set4;

public class FizzBuzz {
    public static String fb(int num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(num);
    }
    public static void main(String[] args) {
        System.out.println(fb(15));
        System.out.println(fb(3));
        System.out.println(fb(5));
        System.out.println(fb(2));
    }
}
