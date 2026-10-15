// class Solution {
//     public int[] smallerNumbersThanCurrent(int[] nums) {

//     int [] myArr= new int[nums.length];
    
//      for(int i=0; i<nums.length; i++){
//         int count=0;

//         for(int j=0; j<nums.length; j++){
//             if(nums[i]>nums[j]){
//                 count++;
//             }
//             myArr[i]=count;
//         }
//      }   
//      return myArr;
//     }
// }


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

    int [] cnt= new int[101];
    
     for(int i=0; i<nums.length; i++){
        cnt[nums[i]]++;
     }

     for(int i=1; i<cnt.length; i++){

        cnt[i]=cnt[i]+cnt[i-1];
     }

     for(int i=0; i<nums.length; i++){
        if(nums[i]==0){
            nums[i]=0;
        }else{
        nums[i]=cnt[nums[i]-1];
        }
     }
     return nums;
     
    }
}