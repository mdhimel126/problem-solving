class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int middle=(0+nums.length-1)/2;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==nums[middle] && i!=middle){
                return false;
            }
        }
        return true;


    }
}