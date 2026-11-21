// class Solution {
//     public int sumDivisibleByK(int[] nums, int k) {
        
//         Arrays.sort(nums);
//         int [] count=new int [101];
//         int sum=0;

//         for(int i=0; i<nums.length; i++){
//             count[nums[i]]++;
//         }

//         for(int i=0; i<nums.length; i++){
//             int freq=count[nums[i]];

//             if(freq%k==0){
//                 sum=sum+(nums[i]*freq);
//                 i=i+freq-1;
//             }
//         }
//         return sum;
//     }
// }

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {

        int [] count=new int [101];
        int sum=0;

        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }

        for(int i=0; i<count.length; i++){
            int freq=count[i];
            if(freq>0 && freq%k==0){
                sum=sum+(i*freq);
            }
        }
        return sum;
    }
}
