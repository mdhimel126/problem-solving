class Solution {
    public int missingMultiple(int[] nums, int k) {
        int smallest=0;
        
        for(int j=1; j<=nums.length; j++){
            int flag=0;
            int val=k*j;
            for(int i=0; i<nums.length; i++){
                if(nums[i]==val){
                    flag=1;
                }
            }
            if(flag==0){
                return val;
            }

        }
        return k*(nums.length+1);
    }
}