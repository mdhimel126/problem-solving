class Solution {
    public int thirdMax(int[] nums) {

        int n=nums.length;


        int fst=Integer.MIN_VALUE;
        int snd=fst;
        int trd=snd;
       
        int temp=0;

       for(int i=0; i<n; i++){
         if(nums[i]==Integer.MIN_VALUE){
            temp=1;
         }
         if(nums[i]>fst){
            trd=snd;
            snd=fst;
            fst=nums[i];
         }else if(nums[i]<fst && nums[i]>snd){
            trd=snd;
            snd=nums[i];
         }else if(nums[i]<fst && nums[i]<snd && nums[i]>trd){
            trd=nums[i];
         }
        
        
       }

       if(n==2){
        trd=fst;
       }else if(temp==0 && trd==Integer.MIN_VALUE){
        trd=fst;
       }else if(snd==Integer.MIN_VALUE && fst!=Integer.MIN_VALUE){
        trd=fst;
       }
    
        return trd;
    }
}