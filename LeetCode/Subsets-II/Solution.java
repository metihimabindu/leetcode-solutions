class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> l2=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums,0,l2,l1);
        return l2;
    }
    public static void backtrack(int []nums,int index,List<List<Integer>>l2,List<Integer> l1){
        l2.add(new ArrayList<>(l1));
       for(int i=index;i<nums.length;i++){
        if(i>index && nums[i]==nums[i-1]){continue;}
        l1.add(nums[i]);
        backtrack(nums,i+1,l2,l1);
        l1.remove(l1.size()-1);
       }
    }
}