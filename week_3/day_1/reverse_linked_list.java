class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode forward= null;
        ListNode previous=null;
        while(current!=null){
            forward=current.next;
            current.next=previous;
            previous=current;
            current=forward;

        }
        return previous;
    }
}