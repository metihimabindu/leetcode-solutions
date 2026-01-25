1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        Arrays.sort(nums);int min=Integer.MAX_VALUE;
4      for(int i=0;i<nums.length;i++){
5        int c=0;
6        for(int j=i;j<nums.length;j++){
7            c++;
8            if(k==c){
9                int diff=Math.abs(nums[i]-nums[j]);
10                min=Math.min(min,diff);
11            }
12        }
13      }  
14      return min;
15    }
16}