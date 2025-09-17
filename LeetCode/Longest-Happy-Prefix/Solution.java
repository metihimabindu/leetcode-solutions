class Solution {
    public String longestPrefix(String s) {
       int len=0,i=1;int n=s.length();
       int []lps=new int[n];
       while(i<n){
        if(s.charAt(i)==s.charAt(len)){
        len++;
        lps[i]=len;i++;
        }else{
            if(len!=0){len=lps[len-1];}else{lps[i]=len;i++;}
        }
       }
        return s.substring(0,lps[n-1]);
    }
}