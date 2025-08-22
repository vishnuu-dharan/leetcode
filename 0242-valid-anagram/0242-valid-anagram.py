class Solution(object):
    def isAnagram(self, s, t):
        s=sorted(list(s))
        t=sorted(list(t))
        #print(,b)
        return s==t
        