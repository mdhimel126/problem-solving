class Solution {
    public char findTheDifference(String s, String t) {
        char [] arr=s.toCharArray();

        for (int i=0; i<=t.length()-1; i++){
            int temp=0;
            char c=t.charAt(i);
            for(int j=0; j<=s.length()-1;j++){
                if(c==arr[j]){
                    temp=1;
                    arr[j]='*';
                    break;
                }
            }
            if(temp==0){
                return c;
            }
        }
        return ' ';
    }
}