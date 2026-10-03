class Solution {
    public int missingNumber(int[] nums) {

        int top=nums.length;
        int total=(top*(top+1))/2;
        int sum=0;
        
        for(int i=0; i<top; i++){
            sum=sum+nums[i];
        }

        return total-sum;
    }
}