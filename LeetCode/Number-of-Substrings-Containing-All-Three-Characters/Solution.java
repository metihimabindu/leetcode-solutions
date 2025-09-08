class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int frq[]={-1,-1,-1};
        for(int i=0;i<s.length();i++){
            frq[s.charAt(i)-'a']=i;
            int index=Math.min(frq[0],Math.min(frq[1],frq[2]));
            if(index!=-1){
                count+=(index+1);
            }
        }
        return count;
    }
}
