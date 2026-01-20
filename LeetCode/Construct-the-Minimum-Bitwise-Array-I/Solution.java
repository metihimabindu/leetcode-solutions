1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int []arr=new int[nums.size()];int c,k=0;
4        for(int i=0;i<nums.size();i++){
5            c=0;
6            for(int j=0;j<=nums.get(i);j++){
7                if((j|j+1)==nums.get(i)){
8                    c++;arr[k++]=j;
9                    break;
10                }
11            }
12            if(c==0){arr[k++]=-1;}
13        }
14        return arr;
15    }
16}