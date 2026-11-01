class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        HashSet <Float> set = new HashSet<>();
        
        int p=0;
        int q=nums.length-1;

        while(p<q){
           float avg=((float)nums[p]+ (float) nums[q])/2;
           set.add(avg);
           p++;
           q--;
        }
        return set.size();
    }
}