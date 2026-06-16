class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode temp1=head1;
        ListNode temp2=head2;
        if(head1==null) return head2;
        if(head2==null) return head1;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp2=temp2.next;

            }
            temp=temp.next;

        }
        while(temp1!=null){
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;
        }
        while(temp2!=null){
            temp.next=temp2;
            temp2=temp2.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}