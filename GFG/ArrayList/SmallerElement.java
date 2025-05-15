package GFG.ArrayList;

import java.util.ArrayList;

public class SmallerElement {
    public ArrayList<Integer> SmallNums(int a[],int x)
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        for (int elem : a) {
            if(elem<x)
            al.add(elem);
            else {
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int [] a={1,90,12,21,34,5,7,9,0};
    SmallerElement se = new SmallerElement();
    ArrayList<Integer> b = se.SmallNums(a, 10);
    System.out.println(b);
    }
}
