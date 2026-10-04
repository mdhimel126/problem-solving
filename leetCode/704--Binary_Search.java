class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int lb=0;
        int ub=n-1;
         int mid=-1;


        while(lb<=ub){
             mid=(lb+ub)/2;

            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                lb=mid+1;
                ub=ub;
            }else if(target<nums[mid]){
                lb=lb;
                ub=mid-1;
            }     
        }
        if(nums[mid]==target){
            return mid;
        }else{
            return -1;
        }
        
    }
}