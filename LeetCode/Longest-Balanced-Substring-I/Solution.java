1class Solution {
2    public int longestBalanced(String s) {
3     int n = s.length();
4        int maxLen = 0;
5
6        for (int i = 0; i < n; i++) {
7            int[] freq = new int[26];
8
9            for (int j = i; j < n; j++) {
10                freq[s.charAt(j) - 'a']++;
11
12                int count = 0;
13                int distinct = 0;
14                boolean valid = true;
15
16                for (int k = 0; k < 26; k++) {
17                    if (freq[k] > 0) {
18                        distinct++;
19                        if (count == 0) {
20                            count = freq[k];
21                        } else if (freq[k] != count) {
22                            valid = false;
23                            break;
24                        }
25                    }
26                }
27
28                if (valid) {
29                    maxLen = Math.max(maxLen, j - i + 1);
30                }
31            }
32        }
33
34        return maxLen;
35    }
36}