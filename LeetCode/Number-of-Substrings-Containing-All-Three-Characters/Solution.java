class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[3];
            int distinct = 0;

            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                if (freq[idx] == 0) distinct++;
                freq[idx]++;

                if (distinct == 3) {
                    count += (n - j);
                    break;  // stop for this i
                }
            }
        }
        return count;
    }
}
