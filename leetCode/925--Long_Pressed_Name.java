class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        int nameLen=name.length()-1;
        int typedLen=typed.length()-1;
        int p=0;
        int q=0;

        while(p<=nameLen && q<=typedLen){
            if(name.charAt(p)==typed.charAt(q)){
                p++;
                q++;
            }else if(p>0 && typed.charAt(q)==name.charAt(p-1)){
                q++;
            }else{
                return false;
            }
        }

        if(p<=nameLen){
            return false;
        }

        while(q<=typedLen){
            if(typed.charAt(q)==name.charAt(p-1)){
                q++;
            }else{
                return false;
            }
        }
        return true;   
    }
}