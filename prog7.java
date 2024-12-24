/*WAP in java which will accept the mark of 3 subject and print the corresponding grade
of for the given mark using if..else statement in java. */
public class prog7 {
    public static void main(String args[]) {
        int mark1 = Integer.parseInt(args[0]);
        int mark2 = Integer.parseInt(args[1]);
        int mark3 = Integer.parseInt(args[2]);
        int total = mark1 + mark2 + mark3;
        float avg = total / 3;
        System.out.println("The average is: " + avg);
        if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 80) {
            System.out.println("Grade: B");
        } else if (avg >= 70) {
            System.out.println("Grade: C");
        } else if (avg >= 60) {
            System.out.println("Grade: D");
        } else if (avg >= 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
    }           
    
}
