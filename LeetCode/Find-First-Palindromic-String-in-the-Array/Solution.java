class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
             StringBuilder str=new StringBuilder(words[i]).reverse();
             String str1=str.toString();
             System.out.println(str1 +" "+words[i]);
            if(words[i].equals(str1)){
                return words[i];
            }
        }
        return "";
    }
}