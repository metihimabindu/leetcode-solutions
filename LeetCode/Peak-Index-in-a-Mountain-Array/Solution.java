class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0,right=arr.length-1,max=0;
        for(int val:arr){max=Math.max(max,val);}
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==max){return mid;}
            else if(arr[mid]>arr[mid+1]){right=mid-1;}
            else{left=mid+1;}
        }
        return -1;
    }
}