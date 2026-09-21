package sorting;

import java.util.Scanner;

public class leetcode88 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
int m= sc.nextInt();
int n= sc.nextInt();
        int [] nums1= new int[m+n];
         int [] nums2= new int[n];
         for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();

         }
         for(int i=0; i<n;i++){
            nums2[i]=sc.nextInt();
         }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // if we do start replacing from the front of the nums1, we might destroy the original values aready there ,so we neeed to find empty spaces.
        int i=m-1;
        int j=n-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }
            else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
            // we are changing k oroginal vlaue too ,mits not like ki the decrement of ks value is only valid for this loop cuz
            // Because k is declared outside the loop (int k = m+n-1;), it exists in the scope of the entire function. Any changes you make to it inside the while loop are permanent.
        }
        while(j>=0){
            nums1[k]= nums2[j];
            j--;
            k--;
        }

        
    } 
    
}

//IMP conccept

//  arrays have a fixed size from the moment they are created.In Java, you cannot create an array with "empty" slots. If you allocate an array of size 6, every single slot must hold a value. For primitive integer arrays (int[]), Java automatically fills any unassigned slots with a default value of 0.