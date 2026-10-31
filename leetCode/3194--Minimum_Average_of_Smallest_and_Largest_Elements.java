class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        float [] arr=new float[(nums.length/2)];
        int k=0;

        int p=0;
        int q=nums.length-1;

        while(p<q){
           arr[k++]=((float) nums[p]+ (float) nums[q])/2;
           p++;
           q--;
        }
        
        float min=Integer.MAX_VALUE;
        for(float val: arr) {
            if(val<min){
                min=val;
            }
        }
        return min;
    }
}