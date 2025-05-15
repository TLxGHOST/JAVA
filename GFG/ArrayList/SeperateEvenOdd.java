package GFG.ArrayList;
import java.util.*;
public class SeperateEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements you want in array list ");
        int limit = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>(limit);
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < limit; i++) {
            int temp = sc.nextInt();
            al.add(temp);
        }
        
        
        ArrayList<Integer> odd = new ArrayList<>();
        
        // for (int elem : al) {
        //     if (elem % 2 == 0) {
        //         continue;
        //     } else {
        //         al.remove(elem);
        //         odd.add(elem);
        //     }
        // }concurrent modification error
        Iterator it=al.iterator();
        
        while(it.hasNext())
        {
            int elem=(Integer)it.next();
            if ( elem% 2 == 0) {
                        continue;
                    } else {
                        it.remove();
                        odd.add(elem);
                    }
        }
        
        System.out.println("Even elements: " + al);
        System.out.println("Odd elements: " + odd);
    }
}
