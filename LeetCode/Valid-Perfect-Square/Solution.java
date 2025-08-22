class Solution {
    public boolean isPerfectSquare(int num) {
        double res=Math.sqrt(num);
          int res1=(int)res *(int)res;
        return num==res1?true:false;
    }
}