class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0,sum1=0;
        for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          while(nums[i]>0){
            sum1+=nums[i]%10;
            nums[i]/=10;
          }
        }
        System.out.println(sum+" "+sum1);
        return sum-sum1;
    }
}