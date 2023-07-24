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
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        ListNode temp=new ListNode();
        temp.next=head;
        if(head==null)
            return head;
        
        while(head!=null){
            
            if(node.val == val)
            {
                temp.next=node.next;
                node = node.next;
            }
            else if(head.val==val){
              temp.next=head.next;
              
            }else{
                temp= head;
               
            }
             head=head.next;
        }
        // if(head.val==val)
        // {
        //     temp.next=null;
        // }
        return node;
    }
}