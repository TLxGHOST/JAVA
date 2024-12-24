/*Find the largest among three number entered accept from keyboard using java. Also
check the equality of all three numbers. */
public class prog8 {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a > b && a > c) {
            System.out.println(a + " is the largest number.");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest number.");
        } else if (c > a && c > b) {
            System.out.println(c + " is the largest number.");
        } else {
            System.out.println("All three numbers are equal.");
        }
    }
    
}
