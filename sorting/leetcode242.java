package sorting;

public class leetcode242 {
    public static void main(String[] args) {
        
    }
    public boolean isAnagram(String s, String t) {

        for(int i=0;i<s.length();i++){
            if(!Character.isLowerCase(s.charAt(i))){
                return false;
            }

        }
         for(int i=0;i<t.length();i++){
            if(!Character.isLowerCase(t.charAt(i))){
                return false;
            }

        }

        if(s.length()!=t.length()){
            return false;
        }

     int [] sArray= new int[26];
     int [] tArray= new int[26];
     for(int i=0;i<s.length();i++){
        sArray[s.charAt(i)-'a']+=1;
     }
     for(int i=0;i<t.length();i++){
        tArray[t.charAt(i)-'a']+=1;
     }

    for(int i=0;i<sArray.length;i++){
        if(sArray[i]!=tArray[i]){
            return false;
        }
       
    }



        return true;
        
    }
}
