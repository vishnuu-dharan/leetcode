class Solution(object):
    def firstMissingPositive(self, nums):
        n=len(nums)
        for i in range(n):
            while 1<=nums[i]<=n and nums[nums[i]-1]!=nums[i]:
                cur=nums[i]-1
                nums[i],nums[cur]=nums[cur],nums[i]
        count=0
        for i in range(n):
            if nums[i]!=i+1:
                return i+1
        return n+1

        