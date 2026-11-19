// class Solution {
//     public int[] countOppositeParity(int[] nums) {
//         boolean Even=false;
//         boolean False=false;
//         int [] arr=new int [nums.length];
//         int k=0;
        
//         for(int i=0; i<=nums.length-2; i++){
//             int count=0;
//             if(nums[i]%2==0){
//                 Even=true;
//                 False=false;
//             }else{
//                 False=true;
//                 Even=false;
//             }
//             for(int j=i+1; j<=nums.length-1; j++){
//                 if(Even){
//                     if(nums[j]%2!=0){
//                         count++;
//                     }
//                 }else{
//                     if(nums[j]%2==0){
//                         count++;
//                     }
//                 }
//             }
//             arr[k++]=count;
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] countOppositeParity(int[] nums) {
      int evenCount=0;
      int oddCount=0;

      for(int i=0; i<nums.length; i++){
        if(nums[i]%2==0){
            evenCount++;
        }else{
            oddCount++;
        }
      }

      for(int j=0; j<nums.length; j++){
        if(nums[j]%2==0){
            evenCount--;
            nums[j]=oddCount;
        }else{
            oddCount--;
            nums[j]=evenCount;
        }
      }
      return nums;
    }
}