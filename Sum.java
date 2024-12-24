//WAP in java which will accept two integers from the command line argument and will
//display the sum of two numbers.
public class Sum {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
    }
    
}
