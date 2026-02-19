1class Solution {
2    public int countBinarySubstrings(String s) {
3     int prev = 0;
4    int curr = 1;
5    int count = 0;
6
7    for (int i = 1; i < s.length(); i++) {
8
9        if (s.charAt(i) == s.charAt(i - 1)) {
10            curr++;
11        } else {
12            count += Math.min(prev, curr);
13            prev = curr;
14            curr = 1;
15        }
16    }
17
18    count += Math.min(prev, curr);
19        return count;
20    }
21}