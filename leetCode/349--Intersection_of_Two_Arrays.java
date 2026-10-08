class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> mySet= new HashSet<>();

        for(int i=0; i<=nums1.length-1; i++){
            for(int j=0; j<=nums2.length-1;j++){
                if(nums1[i]==nums2[j]){
                    mySet.add(nums1[i]);
                    break;
                }
            }
        }
        int [] arr=new int[mySet.size()];

        int k=0;
        for(int i: mySet){
            arr[k++]=i;
        }
        return arr;
    }
}