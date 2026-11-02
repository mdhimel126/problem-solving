class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int l=nums.length-1;
        int p=0;
        int q=l;
        int k=0;
        long sum=0;

        while(p<=q){
            if(p==q){
                sum+=nums[p];
            }else{
            String s=String.valueOf(nums[p])+String.valueOf(nums[q]);
            sum+=Integer.parseInt(s);
            }
            p++;
            q--;
        }
        
        return sum;

    }
}