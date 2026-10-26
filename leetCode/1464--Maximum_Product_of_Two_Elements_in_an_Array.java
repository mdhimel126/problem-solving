class Solution {
    public int maxProduct(int[] nums) {

        int f_max=Integer.MIN_VALUE;
        int s_max=Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length;i++){
            if(nums[i]>f_max){
                s_max=f_max;
                f_max=nums[i];
            }else if(nums[i]>s_max){
                s_max=nums[i];
            }
        }
        return (f_max-1)*(s_max-1);
    }
}