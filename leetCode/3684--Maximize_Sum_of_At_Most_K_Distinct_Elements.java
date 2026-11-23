class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        
        Arrays.sort(nums);

        int [] arr=new int[k];
        int x=0;

        for(int i=nums.length-1; i>=0; i--){
            if(x==k){
                return arr;
            }
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            arr[x++]=nums[i];
        }
        return Arrays.copyOf(arr,x);
    }
}