class Solution {
    public List<Integer> findValidElements(int[] nums) {
        
        List <Integer> list= new ArrayList<>();
        list.add(nums[0]);

        for(int i=1; i<=nums.length-2; i++){
            int flag=0;
            int flag1=0;
            for(int j=i-1; j>=0; j--){
                if(nums[i]<=nums[j]){
                    flag=1;
                    break;
                }
            }
            
            for(int k=i+1; k<=nums.length-1; k++){
                if(nums[i]<=nums[k]){
                    flag1=1;
                    break;
                }
            }
            
            if(flag==0 || flag1==0){
                list.add(nums[i]);
            }
        }
        if(nums.length>1){
            list.add(nums[nums.length-1]);
        }
        return list;
    }
}