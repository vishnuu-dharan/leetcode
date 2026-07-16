class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        k=nums
        nums=sorted(nums)
        dic={}
        for i,v in enumerate(nums):
            if(v not in dic): dic[v]=i
        
        return [dic[i] for i in k]
