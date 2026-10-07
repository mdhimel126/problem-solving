class Solution {

    public boolean isVowel(char x){
        return x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' || x=='E' || x=='I' || x=='O' || x=='U';
    }

    public String reverseVowels(String s) {
        int ptr1=0;
        int ptr2=s.length()-1;
        char temp=0;
 
        char [] arr=s.toCharArray();

        while(ptr1<ptr2){

            while(ptr1<ptr2 && !isVowel(arr[ptr1])){
                ptr1++;
            }

              while(ptr1<ptr2 && !isVowel(arr[ptr2])){
                ptr2--;
            }

         temp=arr[ptr1];
         arr[ptr1]=arr[ptr2];
         arr[ptr2]=temp;

         ptr1++;
         ptr2--;

        }
        String updatedString=new String(arr);
      return updatedString;    
    }
}