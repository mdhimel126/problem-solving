class Solution {
    public boolean isPrefixString(String s, String[] words) {

        int sLen=s.length()-1;
        int p=0;
        

        for(String word: words){

            int wLen=word.length()-1;
            int q=0;

            while(p<=sLen && q<=wLen){
                if(s.charAt(p)!=word.charAt(q)){
                    return false;
                }
                p++;
                q++;
            }
            if(p>sLen && q>wLen){
                return true;
            }

        }
        
       
        return false;
        
    }
}