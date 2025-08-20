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
       /* ListNode curr=head;int count=1;
        List<Integer>l=new ArrayList<>();
         List<Integer>l2=new ArrayList<>();
        while(curr!=null){
            if(count%2!=0){
             l.add(curr.val);
            }else{
                l2.add(curr.val);
            }
            count++;
             curr=curr.next;
        }ListNode temp=head;
        int i=0;
        while(i<l.size()){
            temp.val=l.get(i);
            i++;
            temp=temp.next;
        }
         int j=0;
        while(j<l2.size() || temp!=null){
            temp.val=l2.get(j);
            j++;
            temp=temp.next;
        }*/
        return dummy;
    }
}