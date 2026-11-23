class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int [] count=new int[101];

        for(int val:nums){
            count[val]++;
        }

        for(int i=0; i<nums.length; i++){
            int flag=0;

            if(count[nums[i]]>1){
                int value=(int)Math.sqrt(count[nums[i]]);

                for(int j=value; j>1; j--){
                    if(count[nums[i]]%j==0){
                        flag=1;
                    }
                }
                if(flag==0){
                    return true;
                }
            }
           
        }
        return false;
    }
}