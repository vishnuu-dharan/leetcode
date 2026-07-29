# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        dummy=ListNode(0,head)
        curr_node=head
        prev_node=dummy
        for i in range(left-1):
            prev_node=curr_node
            curr_node=curr_node.next
        pre=None
        for i in range(right-left+1):
            next_node=curr_node.next
            curr_node.next=pre
            pre=curr_node
            curr_node=next_node
        prev_node.next.next=next_node
        prev_node.next=pre
        return dummy.next

        