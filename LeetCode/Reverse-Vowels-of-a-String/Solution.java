class Solution {
    public String reverseVowels(String s) {
        StringBuilder s1=new StringBuilder();
         StringBuilder s2=new StringBuilder();
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
           s1.append(s.charAt(i));
        }
       } int j=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
            if(j<s1.length()){
            s2.append(s1.charAt(j));
            j++;
            }
        }else{
            s2.append(s.charAt(i));
        }
       }
       return s2.toString();
    }
}