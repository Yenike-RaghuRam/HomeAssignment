package Set2;

public class Fibinoccifirst10 {
    public static void printFibinocci(int n){
        int[] fib = new int[n+1];
        fib[1] = 0;
        fib[2] = 1;
        System.out.print(fib[1] + " " + fib[2]);
        for(int i=3;i<fib.length;i++){
            fib[i] = fib[i-1] + fib[i-2];
            System.out.print(" " + fib[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printFibinocci(10);
    }
}
