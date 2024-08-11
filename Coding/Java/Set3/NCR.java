package Set3;

public class NCR {
    public static int fact(int n){
        if( n == 1 || n == 0){
            return 1;
        }
        int result = 1;
        for(int i = n ;i >=2;i--){
            result = result * i;
        }
        return result;
    }
    public static int calc_ncr(int n, int r){
        return fact(n) / (fact(n - r) * fact(r));
    }
    public static void main(String[] args) {
        System.out.println(calc_ncr(5,2));
        System.out.println(calc_ncr(3,1));

    }
}
