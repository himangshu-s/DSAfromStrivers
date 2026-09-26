package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class leetcode229 {
    public static void main(String[] args) {
        
    }


     public List<Integer> majorityElement(int[] nums) {
List<Integer> list= new ArrayList<>();
int n= nums.length;
      HashMap<Integer,Integer> map= new HashMap<>();
      for(int i= 0;i<nums.length;i++){

        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
        else{
            map.put(nums[i],1);
        }
      }
      for(int num: map.keySet()){
     if(map.get(num)>(n/3)){
        list.add(num);
     }
      }

      return list;

        
    }
}
