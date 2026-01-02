1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int maxPathSum(TreeNode root) {
18        int max[]=new int[1];
19        max[0]=Integer.MIN_VALUE;
20        maxSum(root,max);
21        return max[0];
22    }
23    public int maxSum(TreeNode root,int []max){
24        if(root==null)return 0;
25        int l=Math.max(0,maxSum(root.left,max));
26        int r=Math.max(0,maxSum(root.right,max));
27        max[0]=Math.max(max[0],l+r+root.val);
28        return root.val+Math.max(l,r);
29    }
30}