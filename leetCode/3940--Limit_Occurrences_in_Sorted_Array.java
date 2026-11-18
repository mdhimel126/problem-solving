// class Solution {
//     public int[] limitOccurrences(int[] nums, int k) {

//         List <Integer> list= new ArrayList<>();
        
//         for(int i=0; i<nums.length; i++){
//              int count=1;
//              list.add(nums[i]);
//              int j=0;
//             for(j=i+1; j<nums.length; j++){
//                 if(nums[i]==nums[j] && count<k){
//                     list.add(nums[j]);
//                     count+=1;
//                 }else if(nums[i]==nums[j] && count>=k){
//                     i=j;
//                     continue;
//                 }
//                 else{
//                     i=j-1;
//                     break;
//                 }
//             }
//              i=j-1;
//         }
//        int [] arr= new int[list.size()];
//        int x=0;
//        for(int val: list){
//         arr[x++]=val;
//        }
//         return arr;
//     }
// }


class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

       int w=0;

       for(int r=0; r<nums.length; r++){
           if(r<k || nums[r]!=nums[w-k]){
               nums[w]=nums[r];
               w++;
           }
       }      
        return Arrays.copyOf(nums,w);
    }
}