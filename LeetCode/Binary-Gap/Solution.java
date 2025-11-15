class Solution {
    public int binaryGap(int n) {
        String str=Integer.toBinaryString(n);
        int left=0,right=0,max=0,res=0;
        while(right<str.length()){
            if(str.charAt(right)=='1'){
                max=Math.max(max,right-res);
                res=right;
            }
            right++;
        }
        System.out.println(str);
        return max;
    }
}