class Solution {
    public int majorityElement(int[] nums) {

        int tracking=nums[0];
        int count=1;

        for(int i=1; i<nums.length; i++){
            
            if(tracking==nums[i]){
                count++;
            }else if(count ==0){
                tracking=nums[i];
                count=1;
            }else{
                count--;
            }
        }
        return tracking;
    }
}