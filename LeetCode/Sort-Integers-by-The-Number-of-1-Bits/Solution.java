1class Solution {
2    public int[] sortByBits(int[] arr) {
3     for(int i = 0; i < arr.length; i++) {
4            arr[i] = Integer.bitCount(arr[i]) * 10001 + arr[i];
5        }
6        Arrays.sort(arr);
7        for(int i = 0; i < arr.length; i++) {
8            arr[i] = arr[i] % 10001;
9        }     
10        return arr;
11    }
12}