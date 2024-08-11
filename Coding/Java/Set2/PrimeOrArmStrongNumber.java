package Set2;


public class PrimeOrArmStrongNumber {

    public static boolean isPrime(int number){
        if(number == 2)
            return true;
        int start= 2;
        while(start <= Math.sqrt(number)){
            if(number % start == 0){
                return false;
            }
            start++;
        }
        return true;
    }

    public static boolean armStrongNumber(int number){
        int orig_num = number;
        String num = String.valueOf(number);
        int num_digits  = num.length();
        int sum = 0;
        while(number != 0){
            int rem = number % 10;
            sum += (int) Math.pow(rem, num_digits);
            number = number / 10;
        }
        return sum == orig_num;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
        System.out.println(isPrime(5));
        System.out.println(armStrongNumber(153));
        System.out.println(armStrongNumber(10));


    }
}
