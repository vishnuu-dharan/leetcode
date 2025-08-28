
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curn=head,pren=null,nextn=head;
        while(curn!=null){
            nextn=curn.next;
            curn.next=pren;
            pren=curn;
            curn=nextn;

        }
        return pren;
        
    }
}