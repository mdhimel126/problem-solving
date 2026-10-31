class Solution {
    public int firstMatchingIndex(String s) {
        char [] arr=s.toCharArray();

        int p=0;
        int q=arr.length-1;

        while(p<=q){
            if(arr[p]==arr[q]){
                return p;
            }
            p++;
            q--;
        }
        return -1;
    }
}