package sorting;

public class leetcode324 {
    public static void main(String[] args) {
        
    }
    public void wiggleSort(int[] nums) {
        for(int i=0; i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                int temp= nums[j];
                nums[j]=nums[j-1];
                nums[j-1]= temp;
            }
            }
        }
        int n = nums.length;
        int [] small= new int[(n+1)/2];
        int [] large= new int[n/2];
        int index= 0;
        for(int i=(n-1)/2;i>=0;i--){
            small[index++]=nums[i];
        }
        index=0;
        for(int i=n-1;i>(n-1)/2;i--){
            large[index++]=nums[i];


        }
        int largeIndex=0;
        int smallIndex=0;

        for(int i=0;i<n;i++){
            if((i%2)==0){
                nums[i]=small[smallIndex++];
            } else{
                nums[i]=large[largeIndex++];
            }

        }

    
        
    }



    
}
