class Solution {
    public int[] resultArray(int[] nums) {
        List <Integer> list1= new ArrayList<>();
        List <Integer> list2= new ArrayList<>();

        list1.add(nums[0]);
        list2.add(nums[1]);

        int p=0;
        int q=0;

        for(int i=2; i<nums.length; i++){
            if(list1.get(p)>list2.get(q)){
                list1.add(nums[i]);
                p++;
            }else{
                list2.add(nums[i]);
                q++;
            }
        }
        int [] arr= new int[list1.size()+list2.size()];
        int k=0;

        for(int val:list1){
            arr[k++]=val;
        }

        for(int val:list2){
            arr[k++]=val;
        }
        return arr;
    }
}