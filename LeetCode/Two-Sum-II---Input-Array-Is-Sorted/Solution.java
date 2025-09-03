class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int []a=new int[2];int k=0;
        while(left<numbers.length){
            int right=numbers.length-1;
            while(left<right){
             int sum=numbers[right]+numbers[left];
              if(sum==target){
                a[k++]=left+1;
                a[k++]=right+1;
                return a;
              }
              right--;
            }
            left++;
        }
        
        return a;
}
}