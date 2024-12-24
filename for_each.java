    import java.util.*;
public class for_each
{
 public static void main(String args[])
 {
 Scanner in=new Scanner(System.in);
   int a[]=new int[10];
   int i=0;
   for(int x:a)
   {
   a[i]=in.nextInt();
   i++;}
   i=0;
   for(int y:a)
   {
   
   System.out.print("\t"+a[i]);
   i++;
   }
   }
   }
   
   
