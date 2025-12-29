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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        Queue<TreeNode> q=new LinkedList<>();
19        List<List<Integer>> l=new ArrayList<>();
20        if(root==null)return l;
21        q.add(root);
22        while(!q.isEmpty()){
23            int size=q.size();
24            List<Integer> l1=new ArrayList<>();
25            for(int i=0;i<size;i++){
26                if(q.peek().left!=null){q.add(q.peek().left);}
27                if(q.peek().right!=null){q.add(q.peek().right);}
28                l1.add(q.poll().val);
29            }
30            l.add(l1);
31        }
32        return l;
33    }
34}