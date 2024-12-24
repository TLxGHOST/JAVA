/*WAP in java which will accept N numbers from command line argument and will display
the total number of even, total number of odd, sum of even, sum of odd and the GRAND
TOTAL. */
public class prog4 {
    public static void main(String args[]) 
    {
        int even = 0, odd = 0, sum_even = 0, sum_odd = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0) {
                even++;
                sum_even += num;
            } else {
                odd++;
                sum_odd += num;
            }
        }
        System.out.println("Total number of even numbers: " + even);
        System.out.println("Total number of odd numbers: " + odd);
        System.out.println("Sum of even numbers: " + sum_even);
        System.out.println("Sum of odd numbers: " + sum_odd);
        System.out.println("Grand total: " + (sum_even + sum_odd));
    }
    
}
