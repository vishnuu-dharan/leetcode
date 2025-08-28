
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null){

            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
            if(fast==slow){
                slow=head;
                while(fast!=slow){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
        
    }
}