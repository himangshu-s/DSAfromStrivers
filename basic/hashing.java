package basic;

import java.util.Scanner;

public class hashing {
    public static void main(String[] args) {
        // so hasing is basicalaly making an hash array whuch maps the input data , let say we have an array of 5 elements and the biggest element can be 12. so we need to calculate how many times the 1 , 3, 5
        // appaears in the array. // so for that we generally do a nirmal liner search along with a count variable .but what if the size of the array is 10ˆ5 , our time complexity will be O(10ˆ5 * N). this is huge. so what we do is - we make a hash array or table that maps each elemtn
        // of the array. others u can directly understand by seeing example.

Scanner scanner= new Scanner(System.in);
int n= scanner.nextInt();

int [] arr= new int[n];
for(int i=0;i<n;i++){
    arr[i]=scanner.nextInt();
    
}
// precompute
// we will get ans in 0(1)
// the array size can only be till 10ˆ6 and if we decalre it as a global context , then it will be till 10ˆ7.
// here we our max number is 12 , so to allocate 12, we need size of 13. 
int hash[]=new int[13];
for (int i=0;i<n;i++){
    hash[arr[i]]+=1;
}


int q; // how many times i wanna ask. 
q= scanner.nextInt();
while(q>0){
    int number;
    number=scanner.nextInt();

// fetch
System.out.println(hash[number]);
q--;
}


    }

    
}
