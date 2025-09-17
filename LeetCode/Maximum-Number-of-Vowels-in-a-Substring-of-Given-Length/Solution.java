class Solution {
    public int maxVowels(String s, int k) {
        int left=0,right=0;int count=0,max=0;
        while(right<s.length()){
            if(right-left+1<=k){
          if(s.charAt(right)=='a' || s.charAt(right)=='e' || s.charAt(right)=='i' || s.charAt(right)=='o'||s.charAt(right)=='u'){count++;}
           max=Math.max(max,count);
            }else{
                 if(s.charAt(left)=='a' || s.charAt(left)=='e' || s.charAt(left)=='i' || s.charAt(left)=='o'||s.charAt(left)=='u'){count--;}
                  left++;
                  right--;
            }
            right++;
        }
        return max;
    }
}