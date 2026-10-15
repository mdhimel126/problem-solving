class Solution {
    public int dominantIndex(int[] nums) {
        int f_index=0;
        int s_val=Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>nums[f_index]){
                s_val=nums[f_index];
                f_index=i;
            }else if(nums[i]<nums[f_index] && nums[i]>s_val){
                s_val=nums[i];
            }
        }
        if(s_val==Integer.MIN_VALUE || nums[f_index]>=s_val*2){
            return f_index;
        }else{
            return -1;
        }
    }
}