//happy number
class solution{
    public boolean happyNumber(int n){
       int slow = n;
       int fast =n;
        do{
        slow = findsquare(slow);
        fast=findsquare(findsquare(fast));
        }while(slow!=fast);
            if(slow==1){
                return true;
            }
            return false;
        }
        int find(int number){
            int ans=0;
            while (number>0){
            int rem =n%10;
            ans += rem*rem;
            number =number/10;
        }
        return ans;
        }
       
