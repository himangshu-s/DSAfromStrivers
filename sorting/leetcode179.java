

public class leetcode179 {
    public static void main(String[] args) {
        int [] nums= {3,30,34,5,9};
System.out.println(largestNumber(nums));
       
    }
    public static String largestNumber(int[] nums) {


    //     StringBuilder sb= new StringBuilder();
    //     for(int i=0;i<nums.length;i++){
    //         sb= sb.append(nums[i]);

    //     }
    //     String str= sb.toString();
    //     int [] arr= new int[str.length()];
    //     for(int i=0;i<29)  
    
    // since  nums is an premitive int array , not an Integer[] object array , we cant use .toString
    String [] str= new String[nums.length];
    for(int i=0;i<nums.length;i++){
        str[i]= String.valueOf(nums[i]);
    }
    
    // custom sorting

    for(int i= 0;i<str.length;i++){
        for(int j=0;j<str.length-i-1;j++){
            String a= str[j];
            String b= str[j+1];

        // now the custom condition
        if((a+b).compareTo(b+a)<0){
            String temp= str[j];
            str[j]=str[j+1];
            str[j+1]=temp;

        }

        }
    }

    // all zero cases
    if(str[0].equals("0")){
        return "0";
        // 
    }
    // build the final String
    StringBuilder sb= new StringBuilder();
    for(int i=0;i<str.length;i++){
        sb= sb.append(str[i]);
    }

    return sb.toString();
    }
    
}
