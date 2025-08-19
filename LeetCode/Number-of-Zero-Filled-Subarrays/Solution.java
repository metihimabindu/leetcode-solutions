class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0,sum=0;
        List<Long> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
             count++;
             sum=count;
            }else{
                sum=count;
                l1.add(sum);
                count=0;
            }
        }
         if(nums[nums.length-1]==0){
                l1.add(sum);
            }
            long res=0;
            for(int i=0;i<l1.size();i++){
                res+=(l1.get(i)*(l1.get(i)+1))/2;
            }
                return res;
    }
}