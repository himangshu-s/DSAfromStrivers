package linkedList;

public class leetcode202 {

    public boolean isHappy(int n) {
        int fast= n;
        int slow= n;
        do{
            fast= findsquare(findsquare(fast));
            slow= findsquare(slow);

        }while(fast !=slow);
        if(slow==1){
            return true;
        } 
        return false;
        
    }

    private int findsquare(int number){
        int ans= 0;
        while(number>0){
            int rem= number %10;
            ans = ans + rem*rem;
            number= number/10;

        }
        return ans;
    }
}
    

