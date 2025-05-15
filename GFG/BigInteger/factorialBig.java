package GFG.BigInteger;
import java.math.BigInteger;
import java.util.*;
public class factorialBig {
    public static BigInteger fact(int a){
        BigInteger x=new BigInteger("1");
        for(int i=2;i<a;i++)
        {
            BigInteger temp=BigInteger.valueOf(i);
           x= x.multiply(temp);
            System.out.println(x);
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        System.out.println("VAlue of factorial is "+factorialBig.fact(a));
    }
}
