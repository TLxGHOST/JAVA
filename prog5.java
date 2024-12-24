/* WAP in java which will accept 10 integers from the command prompt and display every
alternate integer.*/
public class prog5 {
    public static void main(String args[]) {
        System.out.println("The alternate integers are:");
        for (int i = 0; i < args.length; i += 2) {
            System.out.println(args[i]);
        }
    }
    
}
