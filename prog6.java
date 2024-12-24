/* Write a menu driven program for arithmetic operations ( addition, subtraction,
multiplication &amp; division) for 2 integers using witch case, ask the user whether to
continue or not and print the default value as invalid choice. using scanner class

*/
import java.util.Scanner;
public class prog6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        while (choice == 1) {
            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter your choice:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
                    break;
                case 2:
                    System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
                    break;
                case 3:
                    System.out.println("The product of " + a + " and " + b + " is " + (a * b));
                    break;
                case 4:
                    System.out.println("The quotient of " + a + " and " + b + " is " + (a / b));
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? (1/0)");
            choice = sc.nextInt();
        }
    }
    
}
