class Solution {
    public String reverseByType(String s) {
        char [] arr=s.toCharArray();
        int p=0;
        int q=arr.length-1;

        while(p<q){
            if(arr[p]>='a' && arr[p]<='z'){
                p++;
            }else if(arr[q]>='a' && arr[q]<='z'){
                q--;
            }else{
                char temp=arr[p];
                arr[p]=arr[q];
                arr[q]=temp;
                p++;
                q--;
            }

        }

         p=0;
         q=arr.length-1;

         while(p<q){
            if(arr[p]<'a' || arr[p]>'z'){
                p++;
            }else if(arr[q]<'a' || arr[q]>'z'){
                q--;
            }else{
                char temp=arr[p];
                arr[p]=arr[q];
                arr[q]=temp;
                p++;
                q--;
            }

        }
        return new String(arr);
    }
}