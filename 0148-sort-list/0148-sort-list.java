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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
           return head;
       }
       ListNode mid = findMid(head);
       
       ListNode l = sortList(head);
       ListNode r = sortList(mid);
       ListNode result = merge(l,r);
       
       return result;
    }
    public static ListNode findMid(ListNode head){
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        return slow;
    }
    public static ListNode merge(ListNode left,ListNode right){
        
        ListNode ans = new ListNode(-1);
        ListNode temp=ans;

        while(left!=null && right !=null){
            if(left.val<right.val){
                temp.next=left;
                temp = left;
                left=left.next;

            }
            else{
                temp.next=right;
                temp=right;
                right=right.next;
            }
        }

        while(left!=null){
            temp.next=left;
                temp = left;
                left=left.next;
        }
        while(right!=null){
                temp.next=right;
                temp=right;
                right=right.next;
        }
        ans=ans.next;
        return ans;
    }
}