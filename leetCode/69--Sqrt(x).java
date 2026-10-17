class Solution {
    public int mySqrt(int x) {
        
      long lb=1;
      long ub=x;
      long mid=0;
      int ans=0;

      if(x==1){
        return 1;
      }

      while(lb<=ub){
        mid=(lb+ub)/2;

        if(mid*mid==x){
            return (int) mid;
        }else if(mid*mid<x){
            ans=(int)mid;
            lb=mid+1;
        }else{
            ub=mid-1;
        }
      }
      return ans;
       
        }

}