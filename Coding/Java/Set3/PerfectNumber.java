package Set3;



public class PerfectNumber {

    public static boolean isPerfectNumber(int num){
        int sum_divisors  = 0;
        int initial_divisor = 2;
        while(initial_divisor <= Math.sqrt(num)){
            if(num % initial_divisor == 0) {
                sum_divisors += initial_divisor;
                sum_divisors += num/initial_divisor;
            }
            initial_divisor++;
        }
        return num == sum_divisors+1;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(15));
    }
}
