class Solution {
    public String firstPalindrome(String[] words) {

            for(String s: words ){
                int flag=1;
                int p=0;
                int q=s.length()-1;

                while(p<q){
            
                    if(s.charAt(p)!=s.charAt(q)){
                        flag=0;
                        break;
                    }
                    p++;
                    q--;
                }
                if(flag==1){
                    return s;
                }
            }
        return "";
    }
}