class Solution {
    public String reversePrefix(String word, char ch) {
        char [] arr=word.toCharArray();
        
        int p=0;
        int q=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ch){
                q=i;
                break;
            }
        }

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