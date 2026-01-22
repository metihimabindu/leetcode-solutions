1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=0;j<nums.length;j++){
6                if(i!=j){
7                 int diff=(nums[i]-1)*(nums[j]-1);
8                 max=Math.max(diff,max);
9                }
10            }
11        }
12        return max;
13    }
14}