class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        a=[]
        set1=set(nums)
        for i in range(1,len(nums)+1):
            if i not in set1:
                a.append(i)

        # if(len(a)==0):a.append(j+1)
        return a
        