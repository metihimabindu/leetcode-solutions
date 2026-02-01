1class Solution {
2    public int minimumCost(int[] nums) {
3        int sum=nums[0],min=Integer.MAX_VALUE;
4        for(int i=1;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6           int s =sum+nums[i]+nums[j];
7            if(min>s){
8                min=s;
9            }
10        }
11        }
12        return min;
13    }
14}