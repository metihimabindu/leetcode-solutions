class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> l1=new HashSet<>();
        HashMap<Integer,Integer> l=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            l.put(nums1[i],l.getOrDefault(nums1[i],0)+1);
        }
       for(int i=0;i<nums2.length;i++){
        if(l.containsKey(nums2[i])){
            l1.add(nums2[i]);
        }
       }
       int[] arr=new int[l1.size()];int k=0;
       for(int i:l1){
           arr[k++]=i;
       }
       System.out.println(l1);
       return arr;
    }
}