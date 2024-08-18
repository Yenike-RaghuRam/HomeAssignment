package Set5;

public class VerifyPalindromeUsingRecursion {

    private static boolean helper(int num, int rev, int temp){
        if(temp == 0){
            return num == rev;
        }
        return helper(num, rev * 10 + temp % 10, temp/10);
    }

    public static boolean verifyPalind(int num){
        return helper(num, 0, num);
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(verifyPalind(num));
    }
}
