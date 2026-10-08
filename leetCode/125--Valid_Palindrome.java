class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        char [] arr=s.toCharArray();

        int ptr1=0;
        int ptr2=s.length()-1;

        while(ptr1<ptr2){

            if(arr[ptr1]!=arr[ptr2]){
                return false;
                
            }
            ptr1++;
            ptr2--;
        }

        return true;

    }
}