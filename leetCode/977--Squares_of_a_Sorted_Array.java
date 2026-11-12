// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0; i<nums.length; i++){
//             nums[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }


class Solution {
    public int[] sortedSquares(int[] nums) {
        int p=0;
        int q=nums.length-1;

        int [] newArr= new int[nums.length];
        int k=newArr.length-1;

        while(p<=q){
            int x=nums[p]*nums[p];
            int y=nums[q]*nums[q];

            if(x>=y){
                newArr[k--]=x;
                p++;
            }else{
                newArr[k--]=y;
                q--;
            }
        }
        return newArr;
    }
}