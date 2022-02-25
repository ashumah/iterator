package iterator;

import java.io.*;
import java.util.*;
  
public class iterator {

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
  
        list.add("Ashu");
        list.add("Bitu");
        list.add("Cat");
        list.add("Dog");
        list.add("Elgal");
  
        // Iterator to traverse the list
        Iterator iterator = list.iterator();
  
        System.out.println("List elements : ");
  
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
  
        System.out.println();
    }
}
