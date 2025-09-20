class Solution(object):
    def isPalindrome(self, s):
        li=[ i.lower()  for i in s if i.isalnum()]
        return li[::-1]==li