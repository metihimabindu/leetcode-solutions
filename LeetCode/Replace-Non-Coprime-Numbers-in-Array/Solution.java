class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
       List<Integer> l1 = new ArrayList<>();
        l1.add(nums[0]);   
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = nums[i];
            while (!l1.isEmpty() && gcd(l1.get(l1.size() - 1), res) > 1) {
                int last = l1.remove(l1.size() - 1);
                res = lcm(last, res);
            }
            l1.add(res);
        }
        return l1;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private int lcm(int a, int b) {
        return (a / gcd(a, b)*b);
    }
}