class Solution {
    public int lengthOfLastWord(String s) {
        String myS=s.trim();
        char [] c=myS.toCharArray();
        int count=0;

        for(int i=c.length-1; i>=0; i--){
            if(c[i]==' '){
                return count;
            }
            count=count+1;
        }
        return count;
    }
}