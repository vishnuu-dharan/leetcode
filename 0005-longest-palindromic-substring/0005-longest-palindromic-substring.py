class Solution:
    def longestPalindrome(self, s: str) -> str:
        res=''
        def serch(l,r):
            while l>=0 and r<=len(s)-1 and s[l]==s[r]:
                l-=1
                r+=1
            return s[l+1:r]
        for i in range(len(s)):
            p1=serch(i,i)
            p2=serch(i,i+1)
            if len(p1)>=len(res): res=p1
            if len(p2)>=len(res): res=p2
        return res
        