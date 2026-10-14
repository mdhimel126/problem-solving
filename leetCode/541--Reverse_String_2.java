class Solution {
    public String reverseStr(String s, int k) {

     char [] arr=s.toCharArray();

    for(int i=0; i<s.length();i=i+2*k){
        int ptr1=i;
        int ptr2=Math.min(i+k-1,s.length()-1);

        while(ptr1<ptr2){
            char temp=arr[ptr1];
            arr[ptr1]=arr[ptr2];
            arr[ptr2]=temp;
            ptr1++;
            ptr2--;
        }
    }
      
     String str= new String(arr);
     return str;

    }
}