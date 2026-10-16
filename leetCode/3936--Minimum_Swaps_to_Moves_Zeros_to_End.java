class Solution {
    public int minimumSwaps(int[] nums) {
        int k=nums.length-1;
        int count=0;
        int totalZero=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0){
                count++;
                totalZero++;
            }
        }

        for(int i=k; i>=nums.length-totalZero; i--){
            if(nums[i]==0){
                count--;
            }
        }
        return count;
    }
}