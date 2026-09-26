import java.util.Arrays;

public class cyclicsort {
 public static void main(String[] args) {
    int [] nums= {3,0,2,1};
    int i=0;
    while(i<nums.length){
        int correctIndex= nums[i];
        if(nums[i]!=nums[correctIndex]){
            int temp= nums[i];
             nums[i]= nums[correctIndex];
             nums[correctIndex]=temp;
        }
        else{
            i++;
        }

    }
    System.out.println(Arrays.toString(nums));
 }
    // Yes, exactly. In Java, primitive arrays do not automatically know how to print their contents nicely.If you try to print an array directly using System.out.println(nums);, Java prints the type and memory address of the array (e.g., [I@6504e93e), which looks like random gibberish.To see the actual numbers inside the array, you must convert it to a string using Arrays.toString(nums)
}
