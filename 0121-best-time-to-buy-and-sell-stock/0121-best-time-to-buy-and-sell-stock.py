class Solution:
    def maxProfit(self, p: List[int]) -> int:
        left=0
        right=1
        max1=0
        while(right != len(p)):
            if p[left]<p[right]:
                max1=max(max1,p[right]-p[left])
            else: left=right
            right+=1
        return max1
        