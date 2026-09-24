package basic;

import java.util.HashSet;

//A HashSet is a Java collection used to store unique elements and quickly check whether an element already exists. It does not allow duplicates and does not maintain sorted order. Import it using import java.util.HashSet; and create it with HashSet<Integer> set = new HashSet<>();. The main methods are add() to insert, contains() to check existence, and remove() to delete. add() and contains() take O(1) average time, making HashSet useful when we need fast lookup. For example, to detect duplicates, loop through the array: if set.contains(num) is true, a duplicate exists; otherwise use set.add(num). Thus, duplicate detection takes O(n) average time and O(n) space. The main logic to remember is: “Have I seen this before?” → HashSet.
// when hashset uses set.add , it basically uses an hash function to store in a specific location, so when we search for that element like set.contains(50), it directly goes to the element , cuz hash function knows the adress already. so time complexity is O(1).
// set is useful cuz it doesn;t allow duplicates, let say we have an array = {1,2,3,4,1}, now we have to add to set, set.add, here u can see it will add all first 4 element in the set , but when we add again set.add(1), nothung ahppe ns, its still {1,2,3,4} cuz 1 is already there in the set. 
// the set.contains() returns true when the element is already in the set, otherwise false.
public class hashset {
    public boolean containsDuplicate(int[] nums) {
// hashset is an object and set is the variable where the hashset gets stored. 
// Integer is the data type of the hashset object mean the set will store integer objects, 
// array is a object too , but it can store premitive int values.
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    
}

// HashSet → the class/type
//set → the reference variable
//new HashSet<>() → creates the HashSet object
//<Integer> → says the Set will store Integer objects