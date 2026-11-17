class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for(int i=0; i<=nums.length-1; i++){
             int val1=nums[i];
             int idx1=i;

             for(int j=nums.length-1; j>=i; j--){
                if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference){
                   return new int []{i,j};
                }
             }
        }
       
    return new int []{-1,-1};
    }
}