class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int []a=new int[n];int k=0;
        for(int val:nums1){
          a[k++]=val;
        }
        for(int v:nums2){
          a[k++]=v;
        }
        Arrays.sort(a);
        double sum=0;int m=(n-1)/2;
        if(n%2==0){
           sum=((double)a[m]+(double)a[m+1])/2;
        }else{
           sum=a[m];
        }
        System.out.println(n+" "+m+" "+sum);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        return sum;
    }
}