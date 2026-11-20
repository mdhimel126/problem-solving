class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=0;
        int min=0;
        int i=0; 
        int j=0;
        for(i=0; i<nums.length; i++){
           if(nums[max]<nums[i]){
            max=i;
           }
            min=i;

           for(j=i; j<nums.length; j++){
             if(nums[min]>nums[j]){
                min=j;
             }

           }
           if(nums[max]-nums[min]<=k){
            return i;
           }
        }
        return -1;
    }
}