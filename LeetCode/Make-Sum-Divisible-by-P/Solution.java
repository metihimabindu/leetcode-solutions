1class Solution {
2    public int minSubarray(int[] nums, int p) {
3        long sum=0;
4        for(int i=0;i<nums.length;i++){
5            sum+=(long)nums[i];
6        }
7        long res=sum%p;
8        if(res==0){return 0;}
9        HashMap<Long,Integer> map=new HashMap<>();
10        map.put(0L,-1);long prefix=0;int min=nums.length;
11        for(int i=0;i<nums.length;i++){
12            prefix=(prefix+nums[i])%p;
13            long n=(prefix-res+p)%p;
14            if(map.containsKey(n)){
15                min=Math.min(min,i-map.get(n));
16            }
17            map.put(prefix,i);
18        }
19        return min==nums.length?-1:min;
20    }
21}