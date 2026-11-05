class Solution {
    public String mergeAlternately(String word1, String word2) {
        char [] arr1=word1.toCharArray();
        int l=arr1.length;
        char [] arr2=word2.toCharArray();
        int l2=arr2.length;

        char [] arr= new char[l+l2];

        int p=0;
        int q=0;
        int idx=0;

        while(p<l && q<l2){
            arr[idx++]=arr1[p];
            arr[idx++]=arr2[q];
            p++;
            q++;
        }

        while(p<l){
            arr[idx++]=arr1[p];
            p++;
        }

        while(q<l2){
            arr[idx++]=arr2[q];
            q++;
        }
        return new String(arr);
    }
}