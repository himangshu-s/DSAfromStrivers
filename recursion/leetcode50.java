
// this one is corrct but leetocde wont accept it , cuz it has uncomplited recisrsion. but this will give u ans.

public class leetcode50 {
    public static void main(String[] args) {
      double finalans= myPow(2.000,2);
      System.out.println(finalans);
    }
    static int count=0;
        static double ans=1;
      public static double myPow(double x, int n) {
    
    if(count==Math.abs(n)){ // MAth.abs() means if n is negeatuve , then it will be assigned as postive to count        return ans;
    }
    if(n>0){
     ans= ans*x;
     count= count+1;
     myPow(x, n);
    }
    if(n<0){
        x=1/x;
        ans= ans*x;
        count= count+1;
        myPow(x, n);
    }
    if(n==0){
      return 1;
    }

        return ans;
      }
}
