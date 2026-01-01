1import java.util.ArrayList;
2
3class Solution {
4    public int[] plusOne(int[] digits) {
5        int n = digits.length;
6        for (int i = n - 1; i >= 0; i--) {
7            if (digits[i] < 9) {
8                digits[i]++;
9                System.out.println(digits[i]);
10                return digits;
11            }
12            digits[i] = 0;
13        }
14        int[] result = new int[n + 1];
15        result[0] = 1;
16        return result;
17    }
18}
19