class Solution {
    public int[] transformArray(int[] nums) {
        int k=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                nums[k++]=0;
            }
        }

        for(int i=k; i<nums.length; i++){
                nums[k++]=1;
            }
        
    
        return nums;
    }
}