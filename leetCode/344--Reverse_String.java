class Solution {
    public void reverseString(char[] s) {
        char temp=0;
        int ptr1=0;
        int ptr2=s.length-1;
        for(int i=0; i<=(s.length-1)/2; i++){
            temp=s[ptr1];
            s[ptr1]=s[ptr2];
            s[ptr2]=temp;

            ptr1++;
            ptr2--;
        }
    }
}