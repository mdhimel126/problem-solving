class Solution {
    public int[] findErrorNums(int[] nums) {
        int l=nums.length;
        int [] count=new int[l+1];
        int [] arr=new int[2];

        for(int i=0; i<nums.length; i++){
             count[nums[i]]++;
        }

        for(int i=0; i<count.length; i++){
            if(count[i]>1){
                arr[0]=i;
            }else if(count[i]<1 && i!=0){
                arr[1]=i;
            }
        }
        return arr;

    }
}