
import java.util.*;

public class brk_cnt {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Printing a table enter a factor of two at which you want to stop Enter ");
        int stp = in.nextInt();
        System.out.println("Enter a factor you want to skip ");
        int skp = in.nextInt();
        for (int i = 0; i <= 100; i++) {
            if ((2 * i) == stp) {
                break; 
            }else if ((2 * i) == skp) {
                continue; 
            }else {
                System.out.println("2 " + "* " + i + " = " + (2 * i));
            }
        }
    }
}
