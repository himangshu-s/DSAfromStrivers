package sorting;

public class leetcode215 {
    public static void main(String[] args) {
        
    }

    public int findKthLargest(int[] nums, int k) {
// since the numbers are -10000 to +10000 , so the size of that array= 20000+1
        int [] hash= new int[20001];
        for(int i= 0;i<nums.length;i++){
            hash[nums[i]+10000]+=1; // +10000 is the offset for the negative integers
            // nums[i] = -10000  → index 0
/*nums[i] = -5      → index 9995
nums[i] = 0       → index 10000
nums[i] = 8       → index 10008
nums[i] = 10000   → index 20000*/
        }


        for(int i=hash.length-1;i>=0;i--){
            k= k-hash[i];
// here in the condition , <= exists for this kind of example=nums = [6, 6, 6, 5]
//k = 2
            if(k<=0){
                return i-10000;
            }
        }

    return 0;
        
    }
    
}
