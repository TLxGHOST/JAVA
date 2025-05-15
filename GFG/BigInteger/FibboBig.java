package GFG.BigInteger;
import java.math.BigInteger;
import java.util.Scanner;
public class FibboBig {
    public static BigInteger fib(int n) {
        if (n == 1) return BigInteger.ZERO; // Fibonacci(1) = 0
        if (n == 2) return BigInteger.ONE;  // Fibonacci(2) = 1

        BigInteger prev = BigInteger.ZERO;
        BigInteger curr = BigInteger.ONE;

        for (int i = 3; i <= n; i++) {
            BigInteger temp = curr.add(prev);
            prev = curr;
            curr = temp;
        }
        return curr;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.err.println("Enter a number");
        int a =in.nextInt();
        System.out.println("Fib value is "+FibboBig.fib(a));
    }
}
