// class Solution {
//     public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
//         List <Integer> list= new ArrayList<>();
//         Set <Integer> set= new TreeSet<>();

//         for(int i=0; i<nums.length; i++){
//             if(nums[i]==key){
//                 list.add(i);
//             }
//         }


//         for(int idx: list){
//             int p=Math.max(0,idx-k);
//             int q=Math.min(nums.length-1,idx+k);

//             while(p<=q){
//                 set.add(p);
//                 p++;
//             }
//         }

//       return new ArrayList<>(set);
//     }
// }






class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List <Integer> list= new ArrayList<>();
        int l=nums.length-1;
        int lastIdx=-1;
        int p=0;
        int q=0;

        for(int i=0; i<=l; i++){
            if(nums[i]==key){
                 p=Math.max(0,i-k);
                 q=Math.min(l,i+k);

            p=Math.max(p,lastIdx+1);

            while(p<=q){
                list.add(p);
                lastIdx=p;
                p++;
            }
            }  
        }
        return list;
    }
}