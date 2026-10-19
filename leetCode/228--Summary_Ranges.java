class Solution {
    public List<String> summaryRanges(int[] nums) {

        List <String> list= new ArrayList<>();
        int n=nums.length;
        int x=0;

        for(int i=0; i<n; i++){
            int first=nums[i];
            while(i+1<n && nums[i+1]==nums[i]+1){
               
                i++;
            }
            int end=nums[i];

             if(first==end){
                list.add(String.valueOf(first));
             }else{
                list.add(first+"->"+end);
             }
        }
       
        return list;
    }
}