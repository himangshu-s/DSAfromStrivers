package basic;

import java.util.Scanner;
// string is a class in java 
// whereas array is an objcet innjava thast why we have to frst initalise it using new by creating a new instance

public class hasingInString {
    public static void main(String[] args) {
        // so in the integer , sice the indexes are also numbers , so we can directly assign values there. but in string , there will be a,b,c d,....z , we cant dorectly assign them to thier respected indexex, we can assume thatbin mind, but cant do programmatically , for that we need to jse ascii values.
        // we will take an 26 size array cuz there are 26 small letters , but let say capital letters and the other special characters are also allowed. for that we will use a 256 size array

        Scanner scanner=new Scanner(System.in);
        String s= scanner.nextLine();
        /*   scanner.next();Reads input until it hits a space. It returns only a single word.
        scanner.nextLine();Reads the entire line of text, including any spaces, until the user presses Enter.
        */

        // pre compute 
        int[] hash= new int[26];
        for (int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']+=1;

        }


        int q= scanner.nextInt();
        while(q>0){
           char c = scanner.next().charAt(0);
           // fetch
           System.out.println(hash[c-'a']);
           q--;
        }
    }
    
    // remeber always if for upper case characters its c-'A'. anad the size of the array is 256.
