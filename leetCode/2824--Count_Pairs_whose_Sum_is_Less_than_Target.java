// class Solution {
//     public int countPairs(List<Integer> nums, int target) {
//         nums.sort(null);
//         int i=0;
//         int count=0;

//        while(i<nums.size()){
//            int j=i+1;
//            while(j<nums.size()){
//             if(nums.get(i)+nums.get(j)<target){
//                 count++;
//             }
//             j++;
//            }
//            i++;
//        }
//        return count;

//     }
// }





class Solution {
    public int countPairs(List<Integer> nums, int target) {
        nums.sort(null);

        int count=0;
        int p=0;
        int q=nums.size()-1;
         
        while(p<q){
            if(nums.get(p)+nums.get(q)<target){
                 count=count+(q-p);
                p++; 
            }else if(nums.get(p)+nums.get(q)>=target){
                q--;
            }
        } 
      
       return count;

    }
}