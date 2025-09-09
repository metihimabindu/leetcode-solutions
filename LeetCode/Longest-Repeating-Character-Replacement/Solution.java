class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen=0;
        int left=0,right=0;
        HashMap<Character,Integer> l1=new HashMap<>();int maxfreq=0;
        while(right<s.length()){
             l1.put(s.charAt(right),l1.getOrDefault(s.charAt(right),0)+1);
              maxfreq=Math.max(maxfreq,l1.get(s.charAt(right)));
                 int changes=(right-left+1)-maxfreq;
                  if(changes<=k){
                    maxlen=Math.max(maxlen,right-left+1);
                 }
                 else{
                    l1.put(s.charAt(left),l1.get(s.charAt(left))-1);
                    if(l1.get(s.charAt(left))==0){
                        l1.remove(s.charAt(left));
                    }
                    left++;
                 }
             right++;
        }
        return maxlen;
    }
}