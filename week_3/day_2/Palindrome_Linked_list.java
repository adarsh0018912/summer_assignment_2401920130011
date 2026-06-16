class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> ans=new ArrayList<>();
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        int n=ans.size();
        int i=0;
        int j=n-1;
        while(i<j){
            if(ans.get(i)!=ans.get(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}