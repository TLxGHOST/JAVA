import
java.io.*;
public class prog {
 //program using input stream reader
    public static void main(String args[]) throws Exception
    {
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);
    System.out.println("Enter your name");
    String name=br.readLine();
    System.out.println("Welcome "+name);
    }   
}
// //out
// //Enter your name
// //Saurabh
// //Welcome Saurabh
// output 2
// Enter your name
// Saurabh Singh
// Welcome Saurabh Singh
// output 3
// Enter your name
// Saurabh Singh
// Welcome Saurabh Singh