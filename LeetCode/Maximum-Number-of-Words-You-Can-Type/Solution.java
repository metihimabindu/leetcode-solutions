class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String []str=text.split(" ");
        int c=0;
        for(String val:str){
            int count=0;
            for(int i=0;i<val.length();i++){
                for(int j=0;j<brokenLetters.length();j++){
                    if(val.charAt(i)==brokenLetters.charAt(j))count++;
                }
            }
            if(count==0) c++;
        }
        return c;
    }
}