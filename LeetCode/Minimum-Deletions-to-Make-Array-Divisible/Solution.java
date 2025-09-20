class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
       Arrays.sort(nums);
       int n=findGcd(numsDivide);
       for(int i=0;i<nums.length;i++){
        if(n%nums[i]==0){
            return i;
        }
       }
       return -1;
    }
    public static int gcd(int a,int b){
        return (b==0)?a:gcd(b,a%b);
    }
    public static int findGcd(int []nums){
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            res=gcd(res,nums[i]);
        }
        return res;
    }
}