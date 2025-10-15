class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        char c;
        for(int i=0;i<s.length();i++){
         c=s.charAt(i);
         if(c=='[' || c=='(' || c=='{') {
            s1.push(c);
         }else{
            if(s1.isEmpty())
                 return false;
         char top=s1.pop();
         if((c==')' && top!='(') || (c==']' && top!='[') || (c=='}' && top!='{')) return false;
        }
         }
        return s1.isEmpty();
    }
}