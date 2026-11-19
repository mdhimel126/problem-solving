class Solution {
    public boolean isPalindromic(String s) {

        String newS="";

        for(int i=s.length()-1; i>=0; i--){
            String bin="";
            int asc=s.charAt(i);

            while(asc>0){
                int rem=asc%2;
                bin=rem+bin;
                asc=asc/2;
            }
            while(bin.length()<8){
                bin='0'+bin;
            }
            newS=bin+newS;
        }

        int p=0;
        int q=newS.length()-1;

        while(p<q){
            if(newS.charAt(p)!=newS.charAt(q)){
                return false;
            }else{
                p++;
                q--;
            }

        }
        return true;
        
    }
}