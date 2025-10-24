class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max=0;
       for(int i=0;i<arr.length;i++){
        max=Math.max(max,arr[i]);
       }
       List<Integer> a=new ArrayList<>();
       for(int i=1;i<=max;i++){
        int count=0;
           for(int j=0;j<arr.length;j++){
                   if(arr[j]==i){count++;}
       }
       if(count==0)a.add(i);
       }
       int val=0;
       if(a.size()==0 || a.size()<k){
        while(a.size()<k){
            max++;
            a.add(max);
        }
       }
       System.out.println(a);
       return a.get(k-1);
    }
}