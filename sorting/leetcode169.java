package sorting;

public class leetcode169 {
    public static void main(String[] args) {
        
    }

   public int majorityElement(int[] nums) {

        // for(int i=0;i<nums.length;i++){
        //     for(int j=1;j<nums.length-i;j++){
        //         if(nums[j-1]>nums[j]){
        //         int temp= nums[j];
        //         nums[j]= nums[j-1];
        //         nums[j-1]= temp;
        //     }
        //     }

        // }
        // int mid= nums.length/2;
        // int majority= nums[mid];


        // return majority;
        int count= 0;
        int candidate=nums[0];
        for(int i=0;i<nums.length;i++){
         if(candidate==nums[i]){
            count++;
         }       
         if(candidate!=nums[i]){
            count--;
         }
         if(count==0){
            candidate= nums[i];
            count++;
         }
        }
    return candidate;
    }
    
}
