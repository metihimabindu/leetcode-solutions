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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List<Integer> l=new ArrayList<>();
19        preorder(root,l);
20        return l;
21    }
22    public static void preorder(TreeNode node,List<Integer> l){
23        if(node==null)return;
24        l.add(node.val);
25        preorder(node.left,l);
26        preorder(node.right,l);
27    }
28}