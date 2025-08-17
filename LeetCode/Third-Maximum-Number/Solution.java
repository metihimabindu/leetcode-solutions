class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        List<Integer> l=new ArrayList<>(s);
        Collections.sort(l);
        Collections.reverse(l);
        int sum=0;
        System.out.println(l);
        if(l.size()==1){
           sum=l.get(0);
        }else if(l.size()==2){
            sum=l.get(0);
        }else{
            sum=l.get(2);
        }
        return sum;
    }
}