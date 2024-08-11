package Set2;

public class SumUntilSingleDigit {
    public static int sumSingleDigit(int num){
        int sum = 0;
        while(num>9){

            int new_num = num;
            while(new_num!=0){
                int rem = new_num % 10;
                sum += rem;
                new_num = new_num / 10;
            }
            num = sum;
            sum = 0;

        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println(sumSingleDigit(56249));
    }
}
