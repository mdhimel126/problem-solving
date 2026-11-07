class Solution {
    public boolean isSubsequence(String s, String t) {
          char [] sArr=s.toCharArray();
          int sLength=sArr.length;
          char [] tArr=t.toCharArray();
          int tLength=tArr.length;

          int p=0;
          int q=0;

          while(p<sLength && q<tLength){
            if(sArr[p]==tArr[q]){
                p++;
                q++;
            }else{
                q++;
            }
          }
          if(p==sLength){
            return true;
          }
          return false;
    }
}