class Solution {
    public int countSegments(String s) {
        char [] arr=s.toCharArray();

        int count=0;

        for(int i=0; i<s.length(); i++){
           
           if(arr[i]!=' ' && (i==0 || arr[i-1]==' ')){
            count++;
           }
        }
        return count;
    }
}