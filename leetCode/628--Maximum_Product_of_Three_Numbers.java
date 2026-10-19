class Solution {
    public int maximumProduct(int[] nums) {
        int firstM=Integer.MIN_VALUE;
        int secondM=Integer.MIN_VALUE;
        int thirdM=Integer.MIN_VALUE;

        int x=Integer.MAX_VALUE;
        int y=Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]>firstM){
                thirdM=secondM;
                secondM=firstM;
                firstM=nums[i];
            }else if(nums[i]>secondM){
                thirdM=secondM;
                secondM=nums[i];
            }else if(nums[i]>thirdM){
                thirdM=nums[i];
            }


            if(nums[i]<x){
                y=x;
                x=nums[i];
            }else if(nums[i]<y){
                y=nums[i];
            }
        }

        return Math.max((firstM*secondM*thirdM),(firstM*x*y));

    }
}