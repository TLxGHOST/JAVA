package GFG.ArrayList;
import java.util.*;
public class pq {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.err.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());
        }
        for (int i : arr) {
            System.out.println(i);
        }     
    }
}
