class Solution {
    public int dominantIndices(int[] nums) {

        int average=0;
        int count=0;

        if(nums.length==1){
            return 0;
        }

        for(int i=0; i<nums.length; i++){
            int sum=0;
            int digit=0;
            for(int j=i+1; j<nums.length; j++){
                sum+=nums[j];
                digit++;
            }
            if(digit>0){
                average=sum/digit;
            }

            if(nums[i]>average){
                count++;
            }
        }
        return count;
    }
}