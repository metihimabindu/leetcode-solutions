/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode temp=head.next;int count=1;
        ListNode t=head;
        ListNode node=new ListNode(head.val);
        ListNode dummy=node;
        while(temp!=null){
            count++;
            if(count%2!=0){
                node.next=new ListNode(temp.val);
                node=node.next;
            }
            temp=temp.next;
        }
        int count1=0;
         while(t!=null){
            count1++;
            if(count1%2==0){
                node.next=new ListNode(t.val);
                node=node.next;
            }
            t=t.next;
        }
        return dummy;
    }
}