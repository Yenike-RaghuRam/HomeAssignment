package Set3;

public class Add2NumberWithoutPlus {

    public static int sumWithoutPlus(int x, int y){
        while(y != 0 ){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(sumWithoutPlus(10, 20));
    }
}
