class Solution {
    public int searchInsert(int[] nums, int target) {

        int indx=nums.length;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=target){
                indx=i;
                break;

            }
        }
        return indx;
    
    }
}