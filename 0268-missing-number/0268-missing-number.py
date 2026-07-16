class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        i=min(nums)

        if (len(nums)==1 and nums[0]==0): return 1
        if (len(nums)==1 and nums[0]>=1) : return i-1
        j=max(nums)
        for i in range(0,j):
            if i not in nums:
                return i

        return j+1
        