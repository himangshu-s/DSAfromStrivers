package sorting;
import java.util.TreeSet;
public class leetcode220 {
    public static void main(String[] args) {
        
    }
    // this ans is nsot optimanl and efficient for large arrays. 
  public boolean containsNearbyAlmostDuplicateBybruteForce(int[] nums, int indexDiff, int valueDiff) {

    for(int i=0;i<nums.length;i++){
        // for(int j=1;j<nums.length-i;j++){
        for(int j=0;j<nums.length;j++){ // for brute force take this , after this we are not leaving any possible pairs, the condiotiodn will be statisfied in the if conditions.
            if(i!=j){
                if(Math.abs(i-j)<=indexDiff){
                    if(Math.abs(nums[i]-nums[j])<=valueDiff){
                        return true;
                    }

                }
            }


        }

    }


    return false;


                                                 }
  public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
TreeSet<Long> set= new TreeSet<>();
for(int i=0;i<nums.length;i++){
    long lower= (long) nums[i]-valueDiff;
    long higher= (long) nums[i]+valueDiff;

    Long x=  set.ceiling(lower);
    if(x !=null && x <=higher){
return true;
    }
    set.add((long) nums[i]);
    if(i>=indexDiff){
        set.remove((long) nums[i-indexDiff]);
    }
}
    return false;
  }
}
