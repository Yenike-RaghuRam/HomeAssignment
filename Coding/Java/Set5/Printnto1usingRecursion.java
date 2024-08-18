package Set5;

public class Printnto1usingRecursion {
    public static void printnto1(int n){
        if(n == 0)
            return;
        System.out.println(n);
        printnto1(n - 1);
    }
    public static void main(String[] args) {
        printnto1(10);
    }
}
