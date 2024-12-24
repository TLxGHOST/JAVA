import java.util.Scanner;
public class grade {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n>=90)
        System.out.println("A");
        else if(n>=80)
        System.out.println("B");
        else if(n>=70)
        System.out.println("C");
        else if(n>=60)
        System.out.println("D");
        else if(n>=50)
        System.out.println("E");
        else
        System.out.println("F");
    }
}
//output
//90
//A
//76
//C
//56
//E
//34
//F
