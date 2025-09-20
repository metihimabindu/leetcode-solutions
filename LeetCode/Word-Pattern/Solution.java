class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> l=new HashMap<>();
         HashMap<String,Character> l1=new HashMap<>();
        String []str=s.split(" ");
        if(str.length!=pattern.length())return false;
        for(int i=0;i<str.length;i++){
            if(l.containsKey(pattern.charAt(i))){
               String s1=l.get(pattern.charAt(i));
               if(!s1.equals(str[i])) return false;
            }else if(l1.containsKey(str[i])){
                char c=l1.get(str[i]);
                  if(c!=pattern.charAt(i))  
                    return false;
            }else{
            l.put(pattern.charAt(i),str[i]);
            l1.put(str[i],pattern.charAt(i));
            }
        }
        return true;
    }
}