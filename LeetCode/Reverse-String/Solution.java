class Solution {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
            System.out.println(s[i]+" "+s[s.length-1-i]);
        }
       /*  for(int i=s.length-1;i>=0;i--){
            System.out.println(s[i]);
         }*/
    }
}