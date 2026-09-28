class Solution {
    public boolean isPalindrome(int x) {
        int initialValue=x;
        int mod=0;
        int reversedValue=0;
        while(x>0){
            mod=x%10;
            reversedValue=(reversedValue*10)+mod;
            x=x/10;
        }

        if(initialValue==reversedValue){
            return true;
        }else{
            return false;
        }
        
    }
}