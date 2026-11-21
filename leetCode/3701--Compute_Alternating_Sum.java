class Solution {
    public int alternatingSum(int[] nums) {
        boolean flag=true;
        int sum=0;

        for(int i=0; i<nums.length; i++){
            if(flag){
               sum+=nums[i];
               flag=false;
            }else{
               sum-=nums[i];
               flag=true;
            }
        }
        return sum;
    }
}