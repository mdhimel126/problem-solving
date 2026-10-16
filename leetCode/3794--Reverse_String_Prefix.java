class Solution {
    public String reversePrefix(String s, int k) {
        char [] arr=s.toCharArray();
        int p=0;
        int q=k-1;
        

        while(p<q){
            
            char temp=arr[p];
            arr[p]=arr[q];
            arr[q]=temp;

            p++;
            q--;
        }
    
        return new String(arr);
    }
}