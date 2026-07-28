class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        res=[]
        def perm(sub="",i=0):
            if i==len(s):
                res.append(sub)
                return
            if s[i].isalpha():
                perm(sub+s[i].swapcase(),i+1)
            perm(sub+s[i],i+1)
        
        perm()
        return res
        