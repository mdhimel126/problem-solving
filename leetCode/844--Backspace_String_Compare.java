class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque <Character> queue1= new ArrayDeque<>();
        Deque <Character> queue2= new ArrayDeque<>();

        char [] arr1=s.toCharArray();
        char [] arr2=t.toCharArray();

        for(int i=0; i<arr1.length; i++){
            if(arr1[i]=='#'){
                if(!queue1.isEmpty()){
                    queue1.pop();
                }
            }else{
                queue1.push(arr1[i]);
            }
        }

        for(int i=0; i<arr2.length; i++){
            if(arr2[i]=='#'){
                if(!queue2.isEmpty()){
                    queue2.pop();
                }
            }else{
                queue2.push(arr2[i]);
            }
        }

        return new ArrayList<>(queue1).equals(new ArrayList<>(queue2));
    }
}
