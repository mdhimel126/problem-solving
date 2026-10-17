class Solution {
    public String reverseOnlyLetters(String s) {
        char [] arr=s.toCharArray();
        int p=0;
        int q=s.length()-1;

        while(p<q){
            if(!Character.isLetter(arr[p])){
                p++;
            }else if(!Character.isLetter(arr[q])){
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