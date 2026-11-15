class Solution {
    public String rearrangeString(String s, char x, char y) {
        
        char [] arr=s.toCharArray();
        int l=arr.length-1;

        int p=0;
        int q=l;

        while(p<q){
            
            if(arr[p]!=x && arr[q]!=y){
                p++;
                q--;
            }else if(arr[p]==x && arr[q]!=y){
                q--;
            }else if(arr[p]!=x && arr[q]==y){
                p++;
            }else{

                char temp=arr[p];
                arr[p]=arr[q];
                arr[q]=temp;
            }
        }

        return new String(arr);
    }
}