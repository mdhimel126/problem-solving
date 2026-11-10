class Solution {
    public boolean checkIfExist(int[] arr) {
        
        for(int i=0; i<=arr.length-1; i++){
            int currValue=arr[i];
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[j]*2==currValue || currValue*2==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}