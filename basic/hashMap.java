package basic;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map= new HashMap<>();
        // Adding key-value pairs
        map.put("Apple", 10);
        map.put("Banana",20);
        map.put("Mango",30);

        // getting the value of a key 
        System.out.println(map.get("Apple"));
        // checking if a key exists
        System.out.println(map.containsKey("Banana"));

        // updating the value of an existing key
        map.put("Apple",15);

        // removing a key-value pair
        map.remove("Banana");
        // checking the size
        System.out.println(map.size());

        // getOrdefaut()

        System.out.println(map.getOrDefault("Orange",0));

        // iterating through the HashMap
        for(String key: map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
    
}
