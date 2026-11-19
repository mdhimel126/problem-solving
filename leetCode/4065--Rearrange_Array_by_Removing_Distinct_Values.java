class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] count=new int [101];

        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
        
        int k=0;
        while(k<nums.length){
            for(int j=0; j<count.length; j++){
                if(count[j]>0){
                    nums[k++]=j;
                    count[j]--;
                }
            }
        }
        return nums;
    }
}