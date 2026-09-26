package sorting;

public class leetcode268 {
    public static void main(String[] args) {
        
    }
     public int missingNumberBysumMethode(int[] nums) {
        int [] fullArray= new int[nums.length+1];
        for(int i=0;i<fullArray.length;i++){
            fullArray[i]=i;
        }
        int highestNo=fullArray.length-1;
        int sumFullArray=( highestNo*(highestNo+1))/2;
        int sumNums=0;
        for(int i=0;i<nums.length;i++){
            sumNums+=nums[i];
        }

        int missingNumber= sumFullArray-sumNums;

return missingNumber;


     }

public int missingNumber(int[] nums) {


      int [] fullArray= new int[nums.length+1];
        for(int i=0;i<fullArray.length;i++){
            fullArray[i]=i;
        }

        int xor=0;
        for(int i=0;i<nums.length;i++){
            xor= xor ^ nums[i]; 
        }
        for(int i=0;i<fullArray.length;i++){
            xor ^=fullArray[i];
        }

    return xor;

}


}
