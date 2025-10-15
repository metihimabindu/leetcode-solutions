class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int []arr=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int num=nums1[i],count=0;
            for(int j=0;j<nums2.length;j++){
               if(num==nums2[j]){
                for(int k=j;k<nums2.length;k++){
                  if(num<nums2[k]){
                  arr[i]=nums2[k];count=0;break;
               }else{count++;}
               }}
            }
            if(count>0){arr[i]=-1;}
        }
        return arr;
    }
}