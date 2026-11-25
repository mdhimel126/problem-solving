// class Solution {
//     public int[] findIntersectionValues(int[] nums1, int[] nums2) {
//         int n=nums1.length;
//         int m=nums2.length;
//         int fCount=0;
//         int sCount=0;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m ; j++){
//                 if(nums1[i]==nums2[j]){
//                     fCount+=1;
//                     break;
//                 }
//             }
//         }

//         for(int i=0; i<m; i++){
//             for(int j=0; j<n ; j++){
//                 if(nums2[i]==nums1[j]){
//                     sCount+=1;
//                     break;
//                 }
//             }
//         }
//         return new int []{fCount,sCount};
//     }
// }

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        boolean [] count1= new boolean[101];
        boolean [] count2= new boolean [101];
        int fCount=0;
        int sCount=0;
        for(int val1:nums1){
           count1[val1]=true;
        }

        for(int val2:nums2){
           count2[val2]=true;
        }

        for(int val1:nums1){
            if(count2[val1]){
                fCount+=1;
            }
        }

        for(int val2:nums2){
            if(count1[val2]){
                sCount+=1;
            }
        }

        
        return new int []{fCount,sCount};
    }
}