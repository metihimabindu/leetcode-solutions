1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> l=new ArrayList<>();
4        HashSet<Integer>s=new HashSet<>();
5for(int val:nums)s.add(val);int n=nums.length;int i=1;
6while(i<=n){
7if(!s.contains(i)){l.add(i);}
8i++;
9}
10 return l;
11    }
12}