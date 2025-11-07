class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l2=new ArrayList<>();
         List<Integer> l1=new ArrayList<>();
        search(candidates,target,0,l1,l2);
        return l2;
    }
    public static void search(int []candidates,int target,int index,List<Integer> l1,List<List<Integer>>l2){
        if(index>=candidates.length){
       if(target==0){
            List<Integer> l=new ArrayList<>(l1);
          l2.add(l);
        }
        return ;}
        if(candidates[index]<=target){
            l1.add(candidates[index]);
            search(candidates,target-candidates[index],index,l1,l2);
            l1.remove(l1.size()-1);
    }
        search(candidates,target,index+1,l1,l2);
    }
    }
