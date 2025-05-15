package GFG.BigInteger;
import java.math.BigInteger;
import java.util.*;
public class PrimeNextPrime {
    public boolean isPrime(int a)
    {
        BigInteger b= BigInteger.valueOf(a);
        return b.isProbablePrime(1);
    }
    public int nextPrime(int a)
    {
        BigInteger b= BigInteger.valueOf(a);
        b=b.nextProbablePrime();
        // int k=b.intValue();
        // return k;
        String aa=b.nextProbablePrime().toString();

        return Integer.parseInt(aa);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number ");

        // can only handle small numbers
        // ================================================================================
        //  int p=in.nextInt(); 
        //  PrimeNextPrime Ob=new PrimeNextPrime();
        // System.out.println("The number is Prime "+Ob.isPrime(p));
        // System.out.println("The next number that is Prime "+Ob.nextPrime(p));

        //for a large value might get diffrence in next Probable prime numbers while dealing with small numbers
        // ==========================================================================
         
        String p=in.next(); BigInteger lp=new BigInteger(p); 
        System.out.println("The number is Prime "+lp.isProbablePrime(1));
        System.out.println("The next number that is Prime "+lp.nextProbablePrime());
       
    }
}
