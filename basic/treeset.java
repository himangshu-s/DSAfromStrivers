package basic;

import java.util.TreeSet;
// treeset keeps the element sorted unlike haashset


public class treeset {
    public static void main(String[] args) { 
        TreeSet<Integer> set = new TreeSet<>();
// Adding elements
set.add(10); 
set.add(5); 
set.add(20); 

set.add(15); 
set.add(10); // duplicate, won't be added
System.out.println(set);
// [5, 10, 15, 20]

// Check whether an exact value exists
System.out.println(set.contains(10));
// true

System.out.println(set.contains(7)); 
// false

// Smallest element >= x
 System.out.println(set.ceiling(7)); 
 // 10
 // Largest element <= x 
 System.out.println(set.floor(7)); 
 // 5

 // Smallest element > X
   System.out.println(set.higher(10)); 
   // 15

   // Largest element < x
    System.out.println(set.lower(10)); 
    // 5
    // Remove an element
    set.remove(15);
}
}
