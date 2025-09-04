class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character,Integer> l=new HashMap<>();
      int left=0,right=0,n=s.length()-1; 
      int len=0,maxlen=0;
      while(right<=n){
        char c=s.charAt(right);
        if(l.containsKey(c) && l.get(c)>=left){
            left=l.get(c)+1;
        }
        len=right-left+1;
        maxlen=Math.max(maxlen,len);
        l.put(c,right);
        right++;
      }
      return maxlen;
    }
}