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
17    public boolean isBalanced(TreeNode root) {
18        if(root==null){return true;}
19        int l=hright(root.left);
20        int r=hright(root.right);
21        System.out.println(l+" "+r);
22        if((int)Math.abs(l-r)>1){return false;}
23        boolean left=isBalanced(root.left);
24        boolean right=isBalanced(root.right);
25        return (left && right)?true:false;
26    }
27    public static int hright(TreeNode root){
28         if(root==null){return 0;}
29         return 1+Math.max(hright(root.left),hright(root.right)); 
30    }
31}