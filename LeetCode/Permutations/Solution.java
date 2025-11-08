class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l2=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        back(nums,0,l2,l1,map);
        System.out.println(map);
        return l2;
    }
    public static void back(int []nums,int index,List<List<Integer>>l2,List<Integer> l1,HashMap<Integer,Integer>map){
        if(l1.size()==nums.length){
         l2.add(new ArrayList<>(l1));
         return;
        }
        for(int i=0;i<nums.length;i++){
          if(!(map.containsKey(i))){map.put(i,1); l1.add(nums[i]);
         back(nums,i,l2,l1,map);
         map.remove(i);
         l1.remove(l1.size()-1);
        }
    }
    }
}